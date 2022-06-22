//Controller Pkg

@Controller
public class MemberController {
	
	@Autowired
	private MemberDAO dao;
	
	@Autowired
	private PasswordEncoder passwordEncoder;
	
	@RequestMapping(value="/login", method=RequestMethod.GET)
	public void login() {
	}
	
	@GetMapping("/join")
	public void joinForm() {
		
	}
	
	@PostMapping("/join")
	public ModelAndView joinSubmit(MemberVO m) {
		//encode input pwd using passwordEncoder
		m.setPwd( passwordEncoder.encode( m.getPwd() ) );
		//set new user's role as user
		m.setRole("user");
		//insert userVO into DB, with encoded pwd;
		dao.insert(m);
    //redirect to login page once join is finished
		ModelAndView mav = new ModelAndView("redirect:/login");
		return mav;
	}
	
	//service only logged in user can see => service1
	@RequestMapping("/service1")
	public void service1(HttpSession session) {
		//get logged in user's info from security user entity
		Authentication authentication = 
				SecurityContextHolder.getContext().getAuthentication();
		
		//save user info
		User user = (User)authentication.getPrincipal();
		
		//get id from user entity.
		String id = user.getUsername();
		
		//use session if userinfo should be kept while using service
    //if only it is needed til the redirected page, use ModelAndView
		//if other info is needed, use DAO and get Userinfo and keep it on session
		session.setAttribute("id", id);
		
	}
}

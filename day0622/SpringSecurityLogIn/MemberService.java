//Main Pkg

@Service
@Setter
public class MemberService implements UserDetailsService {

	@Autowired
	private MemberDAO dao;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		System.out.println("Processing LogIn");
		
		MemberVO m = dao.findById(username);
		if(m == null) {//Return Error when input username is invalid
			throw new UsernameNotFoundException(username);
		}
		
		//returns User Entity, if valid user
		UserDetails user = User.builder()
				.username(username)
				.password(m.getPwd())
				.roles(m.getRole())
				.build();
		
		
		return user;
	}

}

@Service
@Setter
public class MemberService implements UserDetailsService {

	@Autowired
	private MemberDAO dao;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// username=>id; Security calls this method automatically
		System.out.println("Log in Process");
		
		MemberVO m = dao.findById(username);
		if(m == null) {//Error returns if user is null.
			throw new UsernameNotFoundException(username);
		}
		
		//if available user, build user object
		UserDetails user = User.builder()
				.username(username)
				.password(m.getPwd())
				.roles(m.getRole())
				.build();
		
		
		return user;
	}

}

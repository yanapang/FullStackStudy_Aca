@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		// TODO Auto-generated method stub
		
		http.authorizeHttpRequests()
		.mvcMatchers("/", "/hello","/all/**").permitAll()//for everyone
		.mvcMatchers("/admin/**").hasRole("admin")//admin page
		.anyRequest().authenticated();//webpage for login user
		
		http.formLogin().loginPage("/login").permitAll()
		.successForwardUrl("/service1");
		
		http.logout()
		.logoutRequestMatcher(new AntPathRequestMatcher("/logout"))
		.invalidateHttpSession(true);
    // requestMapping "/logout" => logout & ends session
		
		http.httpBasic(); //use http default setting for other options
		
		//super.configure(http);
	}

}

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		// TODO Auto-generated method stub
		
		http.authorizeHttpRequests()
		.mvcMatchers("/", "/hello","/all/**", "/join").permitAll()//everyone can see this service
		.mvcMatchers("/admin/**").hasRole("admin")//only admin can use this
		.anyRequest().authenticated();//log in user can use this service
		
		http.formLogin().loginPage("/login").permitAll()
		.successForwardUrl("/service1");
		
		http.logout()
		.logoutRequestMatcher(new AntPathRequestMatcher("/logout"))
		.invalidateHttpSession(true)
		.logoutSuccessUrl("/login");
		// "/logout" -> logout & expire session
		
		http.httpBasic(); //Follow default values for the rest of the setting
		
		//super.configure(http);
	}

}

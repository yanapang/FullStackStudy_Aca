@SpringBootApplication
public class Day0621SecurityApplication {
	
	@Bean
	public PasswordEncoder passwordEncoder() {
		return PasswordEncoderFactories.createDelegatingPasswordEncoder();
	}

	public static void main(String[] args) {
		SpringApplication.run(Day0621SecurityApplication.class, args);
	
	}

}

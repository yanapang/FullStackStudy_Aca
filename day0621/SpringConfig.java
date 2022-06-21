
//configuration file
//sending Email using Java Spring

@Configuration
public class SpringConfig {
	
	@Bean
	public JavaMailSenderImpl javaMailSender() {
    
		JavaMailSenderImpl r = new JavaMailSenderImpl();
		r.setHost("smtp.gmail.com");
		r.setPort(587);
		r.setUsername(" "); //Gmail Id
		r.setPassword("");  // <--- email password
		r.setDefaultEncoding("UTF-8"); //Encoding set to Korean
		
		Properties prop = new Properties();
		prop.put("mail.smtp.starttls.enable", true);
		prop.put("mail.smtp.auth", true);
		prop.put("mail.smtp.ssl.checkserveridentity", true);
		prop.put("mail.smtp.ssl.trust","*");
		prop.put("mail.smtp.ssl.protocols", "TLSv1.2");
		
		r.setJavaMailProperties(prop);
		return r;
	}
	

}

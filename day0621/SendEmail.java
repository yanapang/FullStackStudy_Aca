@Component
@EnableScheduling
@Setter
public class SendEmail {

  @Autowired
	private EmpDAO dao;
	
	@Autowired
	private MailSender mailSender;
	
	            //set schedule for email
              //every 21st 12:00:00 AM
	@Scheduled(cron="0 0 12 21 * ?")
	public void send() {
		List<EmpVO> list = dao.findAll();
		for(EmpVO e: list) {
			String ename = e.getENAME();
			String email = e.getEMAIL();
			int total = e.getSALARY() + e.getCOMM();
			if(email!=null && !email.equals("")) {
				try {
					//Setting email format
					SimpleMailMessage mailMessage = new SimpleMailMessage();
					mailMessage.setFrom(""); //sender's email
					mailMessage.setTo(email);
					mailMessage.setSubject(ename+", This is your pay stub");
					mailMessage.setText(ename+", Your Salary for this Month is $"+ total+".");
					
					
					mailSender.send(mailMessage);//Sending email
					System.out.println("Mail sent to, "+ename);
				}catch(Exception ex) {
					System.out.println("Exception : "+ex.getMessage());
				}
			}
		}
		
		System.out.println("End of Email sending process!");
	}
	

}

@RestController
public class AllController {
	
	//web page: for everyone
	@RequestMapping("/all/everyone")
	public String test1() {
		return "this for everyone!";
	}
	
	//web page: only admin can excess
	@RequestMapping("/admin/menu1")
	public String adminPage() {
		return "welcome to admin's page";
	}
	
	//web page: login required
	@RequestMapping("/loggedIn")
	public String logggedIn() {
		return "You are now logged in";
	}
	
}

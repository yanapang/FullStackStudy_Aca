//Controller Package

@RestController
public class AllController {
	
	//for all
	@RequestMapping("/all/test1")
	public String test1() {
		return "test1";
	}
	
	//for admin
	@RequestMapping("/admin/menu1")
	public String menu1() {
		return "menu1";
	}

	//for logIn user
	@RequestMapping("/service2")
	public String service2() {
		return "service2";
	}
	
}

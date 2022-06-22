@RestController
public class BoardController {

	@GetMapping("/list")
	public String list() {
		try {
			Thread.sleep(1000);
		} catch(Exception e) {
			
		}
		return "list";
	}
	
	@GetMapping("/insert")
	public String insert() {
		try {
			Thread.sleep(3000);
		} catch(Exception e) {
			
		}
		int []a = {10, 20, 30};
		System.out.println(a[5]); //error added to run AfterThrowing Avice
		return "insert";
	}
}

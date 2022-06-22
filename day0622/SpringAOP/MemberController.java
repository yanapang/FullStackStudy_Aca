@RestController
public class MemberController {
	@GetMapping("/insertMember")
	public String insertMember() {
		return "insertMember";
	}
}

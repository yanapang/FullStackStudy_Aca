@RestController
public class NewsController {

	@GetMapping("/news")
	public String news() {
		return "BreakNews!.";
	}
}

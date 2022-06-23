@Controller
public class HelloController {
	@GetMapping("/hello")
	public void hello(Model model) {
		model.addAttribute("name","Hong");
		model.addAttribute("age",20);
		
		ArrayList<String> list = new ArrayList<String>();
		list.add("Apple");
		list.add("Grape");
		list.add("Watermelon");
		model.addAttribute("list",list);
	}
}

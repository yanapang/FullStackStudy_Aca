@Controller
@Setter
public class BookController {
	
	@Autowired
	private BookDAO dao;
	
	@GetMapping("/listBook")
	public void listBook(Model model) {
		model.addAttribute("list", dao.listBook());		
	}
	
	@GetMapping("/detailBook/{bookid}")
	public ModelAndView detailBook(@PathVariable int bookid, Model model) {
		ModelAndView mav = new ModelAndView("/detailBook");
		model.addAttribute("book", dao.getBook(bookid));
		return mav;
	}
	
	@GetMapping("/updateBook/{bookid}")
	public ModelAndView updateBook(@PathVariable int bookid) {
		ModelAndView mav = new ModelAndView("updateBook");
		mav.addObject("book", dao.getBook(bookid));
		return mav;
	}
	
	@PostMapping("/updateBook")
	public ModelAndView updateBook(BookVO b) {
		ModelAndView mav = new ModelAndView("redirect:/listBook");
		dao.updateBook(b);
		return mav;
	}
	
	@GetMapping("/deleteBook/{bookid}")
	public ModelAndView deleteBook(@PathVariable int bookid) {
		ModelAndView mav = new ModelAndView("redirect:/listBook");
		dao.deleteBook(bookid);
		return mav;
	}
}

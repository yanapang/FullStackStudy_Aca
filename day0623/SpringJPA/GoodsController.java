@Controller
@Setter
public class GoodsController {

	@Autowired
	private GoodsService goodsService;
	
	@GetMapping("/listGoods")
	public void listGoods(Model model){
		model.addAttribute("list", goodsService.findAll());
	}
	
	@PostMapping("/saveGoods") //insert, update 용으로 사용.
	public ModelAndView save(GoodsVO g) {
		ModelAndView mav = new ModelAndView("/listGoods");
		goodsService.save(g);
		return mav;
	}
	
	@GetMapping("/updateGoods/{no}")
	public ModelAndView updateForm(@PathVariable int no, Model model) {
		model.addAttribute("g", goodsService.getOne(no));
		ModelAndView mav = new ModelAndView("/updateGoods");
		return mav;
	}
	

	
}

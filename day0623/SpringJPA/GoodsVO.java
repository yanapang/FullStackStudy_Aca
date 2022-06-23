@Entity
@Data
@Table(name="goods")
public class GoodsVO {
	@Id
	private int no;
	private String name;
	private int price;
	private int qty;
	private String fname;
}

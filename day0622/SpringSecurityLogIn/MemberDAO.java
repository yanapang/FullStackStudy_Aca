//DAO pkg

@Repository
public class MemberDAO {

	public MemberVO findById(String id) {
		return MemberManager.findById(id);
	}
	
	public int insert(MemberVO m) {
		return MemberManager.insert(m);
	}
	
	
}

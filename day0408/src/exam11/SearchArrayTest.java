package exam11;

class SearchArray{
	public void search(int []arr, int data) {
		
		int i;
		for(i=0; i<arr.length; i++) {
			if(arr[i]==data) {
				break;
			}
		}
		if(i==arr.length) {
			//찾지 못한 경우
			System.out.println("찾고자 하는 데이터는 배열에 없습니다.");
		}else {			
			System.out.println("찾고자하는 "+data+"는 배열의" + i+"번째 있어요!");
		}
	
	}
}
public class SearchArrayTest {
	public static void main(String[] args) {
		int a[] = {10,20,30,40,50};
		SearchArray sa = new SearchArray();
		sa.search(a, 30);
		//찾고자하는 데이터가 배열에 없을때, 이것을 예외로인식시키기
		//사용자정의 예외 
	}
}

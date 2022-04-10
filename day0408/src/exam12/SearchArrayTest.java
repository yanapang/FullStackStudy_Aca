package exam12;

class NotFoundException extends Exception{//사용자 정의 예외 선언
	public NotFoundException(String msg) {
		super(msg);
	}
}

class SearchArray{
	public void search(int []arr, int data) throws NotFoundException{

	int i;
	for(i=0; i<arr.length; i++) {
		if(data==arr[i]) {
			break;
		}
	}
	if(i==arr.length) {
		//찾고자 하는 데이터가 배열에 없는 경우 강제로 예외발생 
		throw new NotFoundException("찾고자 하는"+data+"가 배열에 없습니다.");
	} else {
		System.out.println("찾고자 하는 "+data+"는 배열의 "+i+"번째에 있습니다.");
	}
	}
}

public class SearchArrayTest {
	public static void main(String[] args) {
		try {
			int[]a= {10,20,30,40,50};
			SearchArray sa = new SearchArray();
			sa.search(a, 20);
			sa.search(a, 100);	
		}catch(NotFoundException e){
			System.out.println("예외발생: "+e.getMessage());
		}
	}
}

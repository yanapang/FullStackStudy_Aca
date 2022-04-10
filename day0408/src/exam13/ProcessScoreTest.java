package exam13;

//예외 만들어줌 
class IllegalScore extends Exception{
	public IllegalScore(String msg) {
		super(msg);
	}
}
//점수 계산하는 클래스 만듬, 이 클래스는 오류를 발생 시킬 수 있음.
class ProcessScore {
	double avg;
	public ProcessScore(int []score) throws IllegalScore {
		int tot =0;
		for(int s:score) {
			if(s<0) {
				throw new IllegalScore("성적이 음수일 수는 없습니다."+s);
			}
			tot+=s;
		}
		avg=(double)tot/score.length;
	}
	//avg return method
	public double getAvg() {
		return avg;
	}
}
//메인에서 점수계산 클래스의 메소드를 사용, 오류 발생처리도 여기서 함. 
public class ProcessScoreTest {
	public static void main(String[] args) {
		try {
		int []a = {90,80,100,80,90,70};
		//int []a = {90,80,100,-80,90,70};
		ProcessScore ps = new ProcessScore(a);
		System.out.println("평균: "+ps.getAvg());
		}catch(IllegalScore e){
			System.out.println("예외발생"+e.getMessage());
		}
	}
}
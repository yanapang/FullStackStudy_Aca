package day0401;

public class MaxTest02 {

	public static void main(String[] args) {
		String []name = {"홍길동", "유관순", "이순신", "김유신", "강감찬"};
		int []score = {40, 70, 30, 100, 90};
		
		//find the student with highest score
		
		int i;
		int max = score[0];
		int numb=0; // 최고점수를 갖고있는 인덱스를 구하기 위한 변수 
		
		for (i=1; i<score.length; i++) {
			if (max < score[i]) {
				max = score [i];
				numb = i;
			}
			
			
		}
		//use stored i to find which students own the score.
		
		System.out.println("가장 높은 점수: "+ max);
		System.out.println("학생이름: "+ name[numb]);

	}

}

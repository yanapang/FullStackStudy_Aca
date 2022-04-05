package day0401;

public class MethodTest10_Array {
	//학생의 이름을 입력받아, 가장 점수가 높은 사람의 이름 프린트 
	//(단 중복된 점수는 없다고 가정.)
	public static String getScoreName(String []name, int[]score) {
		String max_name="";
		int max = score[0];
		int idx = 0;
		for(int i=1; i<score.length; i++) {
			if(score[i]>max) {
				 max = score[i];
				 idx = i; //점수 가장 높은 사람의 배열 넘버 저장. 
			}
		}
		max_name = name[idx];
		return max_name;
	}
	public static void main(String[] args) {
		String []name = {"유관순", "이순신", "홍길동", "김유신", "강감찬"};
		int []score = {60, 70, 80, 100, 50};
		System.out.println("가장 높은 점수의 학생이름은: "+ getScoreName(name, score));

	}

}

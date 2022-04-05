package day0401;

public class MaxTest03 {

	public static void main(String[] args) {
		String []name = {"홍길동", "유관순", "이순신", "김유신", "강감찬"};
		int []score = {40, 100, 30, 100, 90};
		
		//find the student with highest score
		
		//최고점수인 사람이 1명이상일때
		
		//1. find max
		//2. score배열중에 max와 같은 값을 갖는 인덱스들을 구한다.
		//3. 그 인덱스들에 해당하는 학생이름을 출력한다.
		
		//1. max값 구하기.
		int max = score[0];
		for(int i=1; i<score.length; i++) {
			if(score[i] > max) {
				max=score[i];
			}
		}
		
		//2. score배열중에 max와 같은 값을 갖는 인덱스들을 구합니다.
		int []n = new int[score.length]; //인덱스값을 넣을 배열 선언,길이가 메인 인덱스보다 작으니 그 길이로 선언.
		
		int j=0;
		for(int i=0; i<score.length; i++) {
			if(score[i] == max) {
				n[j] = i;
				j++;
			}
		}
		
		System.out.println("최고점수: "+max);
		System.out.print("최고점수의 학생: ");
		//j변수를 통하여 max와 동일한 값을 갖는 사람의 수를 알 수 있다.
		for(int i=0; i<j; i++) {
			System.out.print(name[n[i]]+" ");
		}
		
	}

}

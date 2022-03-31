package day0331;
//구구단 1에서 50까지.
//강사님 ver. 10 이하의 수라면 3으로 나눴을때 나머지가 0인 수.
//10 이상의 수인 경우,
//10의 자리와, 1의 자리를 각각 비교하여 각각 3의 배수인지 확인, 단 여기서 0을 나누면 0이되므로 0과 같지 않아야함.
//10의 자리나 1의 자리 하나만 3의 배수라면 "짝"
//둘 다 3의 배수라면 "짝짝" 출력.

public class Prac_128No3DoWile {
	public static void main(String[] args) {
		int i=1;
		int n10, n1;
		int cnt=0;
		
		do {
			n10=i/10;
			n1=i%10;
			
			if(i<10) { //한자리의 수
				if(i%3!=0) {
					System.out.print(i+" ");
				} else {
					System.out.print("짝 ");
				}
			} else { //두자리의 수
				//10의 자리
				if (n10%3==0 ) { //10의 자리가 3의 배수인가?
					if(n1%3==0 && n1!=0) { //1의 자리도 3의 배수 & 0을 나누면 0이되서 &&으로 제외.
						System.out.print("짝짝 ");
					} else { //1의 자리는 3의 배수가 아님
						System.out.print("짝 ");
					}

				} else {//10의 자리는 3의 자리가 아님.
					if(n1%3==0 && n1!=0) { //1의 자리만 3의 배수
						System.out.print("짝 ");
					} else { //둘다 3의 배수가 아님.
						System.out.print(i+" ");
					}
					
				}
			}
			i++;
		} while(i<=50);
	}
}

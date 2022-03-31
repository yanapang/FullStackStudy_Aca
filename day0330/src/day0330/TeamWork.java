package day0330;

public class TeamWork {
	public static void main(String[] args) {
		//int cnt=0;
		
		for (int i=1; i<=50; i++) {
			int num10 = i/10;
			int num1 = i%10;
			int cnt = 0;
			
			if (num10 %3 ==0 && num10 !=0) {
				cnt ++;
			}
			
			if (num1 %3 ==0 && num1 !=0)  {
				cnt ++;
			}
			
			if (cnt==0) {
				System.out.print(i+" ");
			} else {
				for (int j=1; j<=cnt;j++)
					System.out.print("¦");
				System.out.print(" ");
			}
			//System.out.println("");
		}
			
	}
}
		
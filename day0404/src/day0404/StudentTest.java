package day0404;

import java.util.Scanner;

public class StudentTest {
//5명의 이름, 국어, 영어, 수학을 입력받아 총점, 평균을 구하고
// 성적순으로 정렬하여 출력하는 프로그램 작성.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String []name = new String[5];
		int []kor = new int [5];
		int []eng = new int [5];
		int []math = new int [5];
		int []tot = new int [5];
		double []avg = new double [5];

		//정렬 전 출력 
		for(int i=0; i<name.length; i++) {
			System.out.println(i+1+"번째 학생의 이름을 입력하세요: ");
			name[i]= sc.next();
			System.out.println(i+1+"번째 학생의 국어점수를 입력하세요: ");
			kor[i]= sc.nextInt();
			System.out.println(i+1+"번째 학생의 영어점수를 입력하세요: ");
			eng[i]= sc.nextInt();
			System.out.println(i+1+"번째 학생의 수학점수를 입력하세요: ");
			math[i]= sc.nextInt();
			
			tot[i]=kor[i]+eng[i]+math[i];
			avg[i]= tot[i]/3.0;
			
		}
		System.out.println("이름 \t 국어 \t 영어 \t 수학 \t총점 \t평균");
		for(int i=0; i<name.length; i++) {
			System.out.println(name[i]+"\t"+
				kor[i]+"\t"+
				eng[i]+"\t"+
				math[i]+"\t"+
				tot[i]+"\t"+
				avg[i]);
		}
	
		//sort
		System.out.println("----------------------------------------");
		System.out.println("*** 성적 순으로 정렬 ***");
		for (int i=0; i<name.length;i++) {
			for (int j=i+1; j<name.length;j++) { //compare the data to next data.
				if (tot[j]>tot[i]) { 
					//총점을 갖고 비교 후, 전체 배열의 인덱스 바꿔줘야함 
					String name_temp = name[i];
					name[i] = name[j];
					name[j] = name_temp;
					
					int temp= kor[i];
					kor[i]=kor[j];
					kor[j]=temp;
					
					temp= eng[i];
					eng[i]=eng[j];
					eng[j]=temp;
					
					temp= math[i];
					math[i]=math[j];
					math[j]=temp;
					
					temp = tot[i];
					tot[i] = tot[j];
					tot[j] = temp;
					
					double temp_avg = avg[i];
					avg[i] = avg[j];
					avg[j]=temp_avg;
				}
			}
		}
		
		
		System.out.println("이름 \t 국어 \t 영어 \t 수학 \t총점 \t평균");
		for(int i=0; i<name.length; i++) {
			System.out.println(name[i]+"\t"+
				kor[i]+"\t"+
				eng[i]+"\t"+
				math[i]+"\t"+
				tot[i]+"\t"+
				avg[i]);
		}
		
		
	}

}

package day0330;

import java.util.Scanner;

public class HW_HoroscopeFinder {

	public static void main(String[] args) {
		// �̸�, ����, ���� �Է¹޾� ���ڸ� �Ǻ��� ���.
		Scanner sc=new Scanner(System.in);
		System.out.println("�̸��� �Է��ϼ���: ");
		String name = sc.next();
		System.out.println("������ �Է��ϼ���: ");
		int brtMth = sc.nextInt();
		System.out.println("������ �Է��ϼ���: ");
		int brtDt = sc.nextInt();
		
		String jari = "";
		boolean isLegit = true;
		
		if (brtMth>=1 && brtMth<=12) {
			switch(brtMth) {
			case 1: if(brtDt>=1 && brtDt<=19) {jari="�����ڸ�";} 
				else if (brtDt<=31) {jari="�����ڸ�";}
				else{isLegit=false;} break;
			case 2: if(brtDt>=1 && brtDt<=18) {jari="�����ڸ�";} 
				else if (brtDt<=28) {jari="������ڸ�";}
				else{isLegit=false;} break;
			case 3: if(brtDt>=1 && brtDt<=20) {jari="������ڸ�";} 
				else if (brtDt<=31) {jari="���ڸ�";}
				else{isLegit=false;} break;
			case 4: if(brtDt>=1 && brtDt<=19) {jari="���ڸ�";} 
				else if (brtDt<=30) {jari="Ȳ���ڸ�";}
				else{isLegit=false;} break;
			case 5: if(brtDt>=1 && brtDt<=20) {jari="Ȳ���ڸ�";} 
				else if (brtDt<=31) {jari="�ֵ����ڸ�";}
				else{isLegit=false;} break;
			case 6: if(brtDt>=1 && brtDt<=21) {jari="�ֵ����ڸ�";} 
				else if (brtDt<=30) {jari="���ڸ�";}
				else{isLegit=false;} break;
			case 7: if(brtDt>=1 && brtDt<=22) {jari="���ڸ�";} 
				else if (brtDt<=31) {jari="�����ڸ�";}
				else{isLegit=false;} break;
			case 8: if(brtDt>=1 && brtDt<=22) {jari="�����ڸ�";} 
				else if (brtDt<=31) {jari="ó���ڸ�";}
				else{isLegit=false;} break;
			case 9: if(brtDt>=1 && brtDt<=23) {jari="ó���ڸ�";} 
				else if (brtDt<=30) {jari="õĪ�ڸ�";}
				else{isLegit=false;} break;
			case 10: if(brtDt>=1 && brtDt<=22) {jari="õĪ�ڸ�";} 
				else if (brtDt<=31) {jari="�����ڸ�";}
				else{isLegit=false;} break;
			case 11: if(brtDt>=1 && brtDt<=22) {jari="�����ڸ�";} 
				else if (brtDt<=30) {jari="����ڸ�";}
				else{isLegit=false;} break;
			case 12: if(brtDt>=1 && brtDt<=24) {jari="����ڸ�";} 
				else if (brtDt<=31) {jari="�����ڸ�";}
				else{isLegit=false;} break;
			}
			if (isLegit == true){
				System.out.println(name+"���� ���ڸ��� "+ jari+"�Դϴ�.");
			} else {
				System.out.println("������ �߸��Է��߽��ϴ�.");
			}
		} else {
			System.out.println("������ �߸��Է��߽��ϴ�.");
		}
	}

}

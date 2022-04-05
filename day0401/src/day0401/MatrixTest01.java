package day0401;

public class MatrixTest01 {

	public static void main(String[] args) {
		int [][]a = new int [3][4]; 
		//[rows][colums] 3rows * 4 colums --> 12 int memory spaces.
		
		int n = 1;
		for (int i=0; i<3; i++) {
			for (int j=0; j<4; j++) {
				a[i][j] = n++;
			}
		}
		
		//print the array
		for(int i=0; i<3; i++) {
			for(int j=0; j<4; j++) {
				System.out.print(a[i][j]+ "\t");
			}
			System.out.println();
		}
	}
}

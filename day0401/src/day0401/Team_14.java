package day0401;

public class Team_14 {
//
	public static void main(String[] args) {
		
		int [][]a = {{1,2,3},{1,2},{1},{1,2,3}};
		
		int i,j;
		for (i=0; i<a.length; i++) {
			for (j=0; j<a[i].length; j++) {			
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	
	}
}

package day0401;

public class Prac_NestedArrayPrint {

	public static void main(String[] args) {
		int [][]arr = new int[4][5];
		
		int i;
		int j;
		int num= 1;
		
		// 저장 
		for (i=0; i<4; i++) { //rows

			for (j=0; j<4; j++) { //columns
				arr[i][j]=num++; //num + 1, after sumbit the data.
				arr[i][4]= arr[i][4]+ arr[i][j]; //add all other column data to last column spot
			}
		}
		
		//출력 하기 
		for (i=0; i<arr.length; i++) {
			for (j=0; j<arr[0].length; j++) { //arr[0].length ==>last column
					System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}

		

	}

}

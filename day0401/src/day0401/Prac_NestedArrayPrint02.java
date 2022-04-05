package day0401;

public class Prac_NestedArrayPrint02 {

	public static void main(String[] args) {
		//5rows 5cols
		//last rows = sum of all row data
		//last cols = sum of all column data
		//last slot = sum of all data.
		
		//create array
		int [][]arr = new int[5][5];
		int num = 1;
		
		//Store data in array
		for (int i=0; i<4; i++) {
			for (int j=0; j<4; j++) {
				arr[i][j]=num++;
				arr[i][4]=arr[i][4]+arr[i][j];
				arr[4][j]=arr[4][j]+arr[i][j];
				arr[4][4] = arr[i][j]+arr[4][4];
			}
		}
		
		//출력 하기 
		for (int i=0; i<arr.length; i++) {
			for (int j=0; j<arr[0].length; j++) { //arr[0].length ==>last column
					System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
	}

}

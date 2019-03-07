package arrysProgram;

public class ArraysMatrixadd {

	public static void main(String[] args) {
		int row =2; int column =3;	
		int a[][]= {{2,10,8},{8,9,10}};
		int b[][]= {{-4,-8,9},{7,6,9}};
		
		
		int sum [][] = new int[row][column];
		
		for (int i=0;i<row;i++) {
			for(int j=0; j<column;j++) {
				
				sum[i][j]=a[i][j] + b[i][j];
			}
		}
		for (int[] x :sum) {
			for (int y: x) {
				System.out.print(y+"  ");
			}
			System.out.println();
			
		}

	}

}

// If element in a matrix is zero, set whole row and column to zero

public class Problem7 {
	public static void main(String[] args) {
		int[][] matrix = {{1,2},{4,0},{7,8}};
		print(matrix);
		setZeros(matrix);
	}
	
	public static void print(int[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			int[] layer = matrix[i];
			for (int j = 0; j < layer.length; j++) {
				System.out.print(layer[j] + " ");
			}
			System.out.println();
		}
		System.out.println("---------");
	}
	
	public static void setZeros(int[][] matrix) {
		boolean[] row = new boolean[matrix.length];
		boolean[] column = new boolean[matrix[0].length];
		
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				if (matrix[i][j] == 0) {
					row[i] = true;
					column[j] = true;
				}
			}
		}
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				if (row[i] || column[j]) {
					matrix[i][j] = 0;
				}
			}
		}
		print(matrix);
	}
}

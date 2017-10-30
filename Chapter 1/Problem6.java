// Image matrix rotation by 90 deg

public class Problem6 {

	public static void main(String[] args) {
		int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
		print(matrix);
		rotate(matrix, 3);
	}
	
	public static void print(int[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			int[] layer = matrix[i];
			for (int j = 0; j < layer.length; j++) {
				System.out.print(layer[j]);
			}
			System.out.println();
		}
		System.out.println("---------");
	}
	
	public static void rotate(int[][] matrix, int n) {
		for (int layer = 0; layer < n / 2; ++layer) {
			int first = layer;
			int last = n - 1 - layer;
			for (int i = first; i < last; ++i) {
				int offset = i - first;
				int top = matrix[first][i];
				matrix[first][i] = matrix[last - offset][first];
				matrix[last - offset][first] = matrix[last][last - offset];
				matrix[last][last - offset] = matrix[i][last];
				matrix[i][last] = top;
			}
		}
		print(matrix);
	}

}

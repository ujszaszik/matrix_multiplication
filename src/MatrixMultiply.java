
public class MatrixMultiply {
	public static void main(String[] args) {
		new MatrixMultiply().run();
	}

	private void run() {
		int[][] m1 = { { 2, 3, 4, }, { 1, 0, 0 } };
		int[][] m2 = { { 0, 1000 }, { 1, 100 }, { 0, 10 } };
		int[][] result = multiply(m1, m2);
		printOutResult(result);
	}

	private int[][] multiply(int[][] m1, int[][] m2) {
		if (m1 == null || m2 == null) {
			System.out.println("This multiplication cannot be done!");
		}
		if (m1.length != m2[0].length) {
			System.out.println("This multiplication cannot be done!");
		}
		int[][] result = new int[m1.length][m2[0].length];
		int sum = 0;
		for (int k = 0; k < m1.length; k++) {
			for (int j = 0; j < m2[0].length; j++) {
				for (int i = 0; i < m1[0].length; i++) {
					sum += m1[k][i] * m2[i][j];
				}
				result[k][j] = sum;
				sum = 0;
			}
		}
		return result;
	}

	private void printOutResult(int[][] result) {
		for (int i = 0; i < result.length; i++) {
			for (int j = 0; j < result[0].length; j++) {
				System.out.print(result[i][j] + " ");
			}
			System.out.println();
		}
	}

}

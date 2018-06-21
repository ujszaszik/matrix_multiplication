
public class MatrixMultiplication implements MatrixOperation {
	private int[][] m1, m2;

	public MatrixMultiplication(int[][] m1, int[][] m2) {
		this.m1 = m1;
		this.m2 = m2;
	}

	@Override
	public void getResult() {
		if (isInValidData()) {
			System.out.println("This multiplication cannot be done!");
			return;
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
		new MatrixPrinter().toConsole(result);
	}

	@Override
	public boolean isInValidData() {
		return m1 == null || m2 == null || m1.length != m2[0].length;
	}

}

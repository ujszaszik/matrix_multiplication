
public class MatrixHadamardProduct implements MatrixOperation {
	private int[][] m1, m2;

	public MatrixHadamardProduct(int[][] m1, int[][] m2) {
		this.m1 = m1;
		this.m2 = m2;
	}

	@Override
	public void getResult() {
		int[][] result = new int[m1.length][m1[0].length];
		for (int i = 0; i < result.length; i++) {
			for (int j = 0; j < result[0].length; j++) {
				result[i][j] = m1[i][j] * m2[i][j];
			}
		}
		new MatrixPrinter().toConsole(result);
	}

	@Override
	public boolean isInValidData() {
		return m1 == null || m1.length == 0 || m2 == null || m2.length == 0 || m1.length != m2.length || m1[0].length != m2[0].length;
	}

}

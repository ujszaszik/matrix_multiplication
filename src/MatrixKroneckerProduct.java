
public class MatrixKroneckerProduct implements MatrixOperation {
	private int[][] m1, m2;

	public MatrixKroneckerProduct(int[][] m1, int[][] m2) {
		this.m1 = m1;
		this.m2 = m2;
	}

	@Override
	public void getResult() {
		int[][] result = new int[m1.length * m2.length][m1[0].length * m2[0].length];
		for (int i = 0; i < m1.length; i++) {
			for (int j = 0; j < m1[0].length; j++) {
				for (int k = 0; k < m2.length; k++) {
					for (int l = 0; l < m2[0].length; l++) {
						result[m2.length * i + k][m2[0].length * j + l] = m1[i][j] * m2[k][l];
					}
				}
			}
		}
		new MatrixPrinter().toConsole(result);
	}

	@Override
	public boolean isInValidData() {
		return m1 == null || m1.length == 0 || m2 == null || m2.length == 0;
	}

}

public class MatrixScalarMultiplication implements MatrixOperation {
	private int scalar;
	private int[][] matrix;

	public MatrixScalarMultiplication(int scalar, int[][] matrix) {
		this.scalar = scalar;
		this.matrix = matrix;
	}

	@Override
	public void getResult() {
		if (isInValidData()) {
			System.out.println("This matrix cannot be multiplicated by a scalar!");
			return;
		}
		int[][] result = matrix;
		for (int i = 0; i < result.length; i++) {
			for (int j = 0; j < result[0].length; j++) {
				result[i][j] = scalar * matrix[i][j];
			}
		}
		new MatrixPrinter().toConsole(result);

	}

	@Override
	public boolean isInValidData() {
		return matrix == null || matrix.length == 0;
	}

}


public class MatrixTransposition implements MatrixOperation {
	private int[][] matrix;

	public MatrixTransposition(int[][] matrix) {
		this.matrix = matrix;
	}

	@Override
	public void getResult() {
		if (isInValidData()) {
			System.out.println("This matrix cannot be transpositioned!");
			return;
		}
		int[][] result = new int[matrix[0].length][matrix.length];
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				result[j][i] = matrix[i][j];
			}
		}
		new MatrixPrinter().toConsole(result);
	}

	@Override
	public boolean isInValidData() {
		return matrix == null || matrix.length == 0;
	}

}

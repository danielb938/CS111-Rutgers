public class MatrixOps {
	public static void main(String[] args) {

	}

	public static double[][] multiply(double[][] A, double[][] B) {

		//Testing to see if null
		if (A[0].length != B.length) {
			return null;
		}

		//Store value to C 2-D array
		double[][] C = new double[A.length][B[0].length];

		for (int i = 0; i < A.length; i++) {
			for (int j = 0; j < B[0].length; j++) {
				for (int k = 0; k < A[0].length; k++) {
						C[i][j] = C[i][j] + A[i][k] * B[k][j]; 
				}
			}
		}
		return C;
	}
}
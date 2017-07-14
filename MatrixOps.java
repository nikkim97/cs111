public class MatrixOps {	
	public static double[][] multiply(double[][] A, double[][] B) {
		
	
		if(A[0].length != B.length) {
			IO.reportBadInput();
			return null;
		}
		
		if(A[0].length == 0 || B.length == 0) {
			IO.reportBadInput();
			double[][] C = new double[0][0];
			return C;
		}
		
		double[][] C = new double[A.length][B[0].length];
		
		for (int i=0; i<A.length ; i++) {
			for (int j=0 ; j<B[0].length ; j++) {
				for (int k=0 ; k <A[0].length ; k++) {
					C[i][j] += A[i][k]*B[k][j];
				}
			}
		}
		
		return C;
	}
}
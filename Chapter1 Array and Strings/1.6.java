// My original Solution:
public void rotatePic(int[][] matrix, int n){

	for (int i = 0 ; i < n/2; i++) {
		for (int j = i ;j < n ; j++ ) {
			int temp = matrix[j][i];
			matrix[j][i] = matrix[j][n-j];
			matrix[j][n-j] = matrix[n-j][n-i];
			matrix[n-j][n-i] = matrix[n-i][j];
			matrix[n-i][j] = temp;
		}
	}
}

//



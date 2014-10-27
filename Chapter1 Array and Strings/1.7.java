public void MatrixTransfer(int[][] matrix, int m, int n) {
    int[] xRow = new int[m];
    int[] yRow = new int[n];
    // Step1: find all zeros's x, y location
    // improvement here: 
    // 		boolean[] row = new boolean[matrix.length];
    //      boolean[] column = new boolean[matrix[0].length]
    for (int i = 0; i < m ; i++) {
        for (int j = 0; j < n ; j++ ) {
            if (matrix[i][j] == 0) {
                xRow[i] = 0;
                yRow[j] = 0;
            } else {
                xRow[i] = 1;
                yRow[j] = 1;
            }

        }

    }

    // Step2: set the zeros to matrix
    for (int i = 0; i < m ; i++) {
        if (xRow[i] == 0) {
            matrix[i][] = 0;

        }

    }

    for (int j = 0; j < n; j++) {
        if (yRow[j] == 0) {
            matrix[][j] = 0;
        }

    }


}
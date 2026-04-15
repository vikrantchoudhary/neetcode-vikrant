class Solution {
    public void setZeroes(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        int zRow[] = new int[n];
        int zCol[] = new int[m];
        for (int i = 0 ; i<n ; i++) {
            for (int j = 0; j<m;j++) {
                if (matrix[i][j] == 0) {
                    zRow[i] =1;
                    zCol[j] = 1;
                }
            }
        }
        for (int i = 0 ; i<n ; i++) {
            for (int j = 0; j<m;j++) {
                if (zRow[i]== 1 || zCol[j] == 1) {
                    matrix[i][j] = 0;
                }
            }
        }
    }
}

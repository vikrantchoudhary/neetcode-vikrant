class Solution {
    public void rotate(int[][] matrix) {
        // rotate and tanspose
        int n = matrix.length;
        int m = matrix[0].length;
        for (int i = 0 ; i< n/2;i++) {
            int[] row = matrix[i];
            matrix[i] =matrix[n -1 -i] ;
            matrix[n-1-i] = row;
        }
        for (int i= 0; i<n;i++) {
            for (int j = i; j< m;j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }
}

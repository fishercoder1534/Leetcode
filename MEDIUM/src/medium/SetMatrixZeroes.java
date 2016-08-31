package medium;

public class SetMatrixZeroes {
    //this is the most straightforward solution which uses O(mn) space
    public void setZeroes(int[][] matrix) {
        if(matrix == null || matrix.length == 0) return;
        int height = matrix.length, width = matrix[0].length;
        boolean[][] zero = new boolean[height][width];
        for(int i = 0; i < height; i++){
            for(int j = 0; j < width; j++){
                if(matrix[i][j] == 0) zero[i][j] = true;
            }
        }
        for(int i = 0; i < height; i++){
            for(int j = 0; j < width; j++){
                if(zero[i][j]){
                    for(int k = 0; k < height; k++) matrix[k][j] = 0;
                    for(int k = 0; k < width; k++) matrix[i][k] = 0;
                }
            }
        }
    }
}
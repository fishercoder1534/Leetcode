package chapter2_binary_search;

/**Write an efficient algorithm that searches for a value in an m x n matrix.

This matrix has the following properties:

Integers in each row are sorted from left to right.
The first integer of each row is greater than the last integer of the previous row.*/
public class Searcha2DMatrix {
    //I'm so glad that I made it AC'ed the first time I submitted it, I really overcame my comfort zone to do this problem:
    //My comfort zone was to just binary search first column first, locate which row, then binary search that row.
    //Then I quickly pushed myself away from this comfort zone and challenged myself to do it using index/col, index%col as row and col indices
    //for a matrix, cheers! And it even got AC'ed the first time I submitted!

    /**
     * @param matrix, a list of lists of integers
     * @param target, an integer
     * @return a boolean, indicate whether matrix contains target
     */
    public boolean searchMatrix(int[][] matrix, int target) {
        // write your code here
        if(matrix == null || matrix.length == 0) return false;
        if(matrix[0][0] > target || matrix[matrix.length-1][matrix[0].length-1] < target) return false;
        int height = matrix.length, width = matrix[0].length, len = height*width, start = 0, end = len-1;
        while(start+1 < end){
            int mid = start + (end-start)/2;
            int row = mid/width, col = mid%width;
            if(matrix[row][col] == target) return true;
            else if(matrix[row][col] > target) end = mid;
            else start = mid;
        }
        if(matrix[start/width][start%width] == target ||
        matrix[end/width][end%width] == target) return true;
        return false;
    }


}

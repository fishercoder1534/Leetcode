package stevesun.algorithms;

/**
 * Given a positive integer n, find the least number of perfect square numbers (for example, 1, 4, 9, 16, ...) which sum to n.

 For example, given n = 12, return 3 because 12 = 4 + 4 + 4; given n = 13, return 2 because 13 = 4 + 9.
 */
public class PerfectSquares {

    public int numSquares(int n) {
        int result = n, num = 2;
        while (num * num <= n) {
            int temp1 = n / (num * num), temp2 = n % (num * num);
            result = Math.min(result, temp1 + numSquares(temp2));
            num++;
        }
        return result;
    }

}

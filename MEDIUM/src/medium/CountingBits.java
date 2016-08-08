package medium;

import utils.CommonUtils;

/**338. Counting Bits  QuestionEditorial Solution  My Submissions
Total Accepted: 37328
Total Submissions: 64455
Difficulty: Medium
Given a non negative integer number num. For every numbers i in the range 0 ≤ i ≤ num calculate the number of 1's in their binary representation and return them as an array.

Example:
For num = 5 you should return [0,1,1,2,1,2].

Follow up:

It is very easy to come up with a solution with run time O(n*sizeof(integer)). But can you do it in linear time O(n) /possibly in a single pass?
Space complexity should be O(n).
Can you do it like a boss? Do it without using any builtin function like __builtin_popcount in c++ or in any other language.

Hint:

You should make use of what you have produced already.
Divide the numbers in ranges like [2-3], [4-7], [8-15] and so on. And try to generate new range from previous.
Or does the odd/even status of the number help you in calculating the number of 1s?

*
*
*/
public class CountingBits {
    //TODO: follow its hint to solve it using DP
    
    
    //use the most regular method to get it AC'ed first
    public int[] countBits(int num) {
        int[] ones = new int[num+1];
        for(int i = 0; i <= num; i++){
            ones[i] = countOnes(i);
        }
        return ones;
    }

    private int countOnes(int i) {
        int ones = 0;
        while(i != 0){
            ones++;
            i &= (i-1);
        }
        return ones;
    }
    
    public static void main(String...strings){
        CountingBits test = new CountingBits();
        int num = 5;
        int[] ones = test.countBits(num);
        CommonUtils.printArray(ones);
    }
}

package com.stevesun.solutions;

/**
 * Additive number is a string whose digits can form additive sequence.

 A valid additive sequence should contain at least three numbers. Except for the first two numbers, each subsequent number in the sequence must be the sum of the preceding two.

 For example:
 "112358" is an additive number because the digits can form an additive sequence: 1, 1, 2, 3, 5, 8.

 1 + 1 = 2, 1 + 2 = 3, 2 + 3 = 5, 3 + 5 = 8
 "199100199" is also an additive number, the additive sequence is: 1, 99, 100, 199.
 1 + 99 = 100, 99 + 100 = 199
 Note: Numbers in the additive sequence cannot have leading zeros, so sequence 1, 2, 03 or 1, 02, 3 is invalid.

 Given a string containing only digits '0'-'9', write a function to determine if it's an additive number.

 Follow up:
 How would you handle overflow for very large input integers?
 */
public class AdditiveNumber {

    public boolean isAdditiveNumber(String num) {
        if (num == null || num.length() < 3) {
            return false;
        }
        int len = num.length();
        for (int i = 1; i < len; i++) {
            for (int j = i + 1; j < len; j++) {
                int first = 0, second = i, third = j;
                if (num.charAt(second) == '0' && third > second + 1){
                    break;// This is the pruning part, for each iteration, if this condition
                    // meets, returns false immediately
                }
                while (third < len) {
                    Long result = Long.parseLong(num.substring(first, second))
                            + Long.parseLong(num.substring(second, third));
                    if (num.substring(third).startsWith((result.toString()))) {
                        first = second;
                        second = third;
                        third += result.toString().length();
                    } else {
                        break;// This is another part of pruning! Cool!
                    }
                }
                if(third == len){
                    return true;
                }
            }
        }
        return false;
    }

}

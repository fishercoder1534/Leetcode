/**
 * 9. Palindrome Number
 * 
 * Determine whether an integer is a palindrome. An integer is a palindrome when it reads the same backward as forward.

Example 1:

Input: 121
Output: true
Example 2:

Input: -121
Output: false
Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
Example 3:

Input: 10
Output: false
Explanation: Reads 01 from right to left. Therefore it is not a palindrome.
Follow up:

Coud you solve it without converting the integer to a string?
*/

class Solution1 {
    /**This is a Java translation, while its Java counterpart could be accepted perfectly, this one failed due to
     * Char 21: runtime error: signed integer overflow: 746384741 * 10 cannot be represented in type 'int' (solution.cpp)
    */
public:
    bool isPalindrome(int x) {
        if (x == 0) {
            return true;
        } else if (x < 0) {
            return false;
        }
        int tmp = x;
        int reverse = 0;
        while (tmp != 0) {
            reverse *= 10;
            reverse += tmp % 10;
            tmp /= 10;
        }
        return reverse == x;
    }
};

class Solution2 {
public:
    bool isPalindrome(int x) {
        if (x < 0 || (x != 0 && x%10 == 0)) {
            return false;
        }
        int sum = 0;
        while (x > sum) {
            sum = sum*10 + x%10;
            x /= 10;
        }
        return (x == sum) || (x == sum/10);
    }
};
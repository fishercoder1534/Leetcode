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
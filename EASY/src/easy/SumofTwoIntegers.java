package easy;

public class SumofTwoIntegers {
//This post is very helpful: http://stackoverflow.com/questions/9070937/adding-two-numbers-without-operator-clarification
    //I also shared my solution here: https://discuss.leetcode.com/topic/49870/one-liner-with-detailed-explanation
    public int getSum(int a, int b) {
        if(b == 0) return a;
        int sum = a^b;
        int carry = (a&b) << 1;
        return getSum(sum, carry);
    }

}

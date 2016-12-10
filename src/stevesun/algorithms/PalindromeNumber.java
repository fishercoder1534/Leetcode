package stevesun.algorithms;

public class PalindromeNumber {
    
    /**Purely my original solution: just reverse the entire number and compare with itself, return if they two are equal or not.*/
    public boolean isPalindrome(int x) {
        if(x == 0) return true;
        if(x < 0) return false;
        int rev = 0, tmp = x;
        while(tmp != 0){
            rev *= 10;
            rev += tmp%10;
            tmp /= 10;
        }
        return rev == x;
    }
    
    /**Then I turned to Discuss and found a more efficient way: reversing only half and then compare if they're equal.*/

}

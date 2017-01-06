package com.stevesun.solutions;
/**7. Reverse Integer  QuestionEditorial Solution  My Submissions
Total Accepted: 155938
Total Submissions: 655150
Difficulty: Easy
Reverse digits of an integer.

Example1: x = 123, return 321
Example2: x = -123, return -321*/
public class ReverseInteger {
    //lastly, after making it AC'ed on my own, I turned to Discuss, and find this very short solution,
    //it turns out we don't need to do any handling for the sign
    public int reverse_short_version(int x){
        long rev = 0;
        while(x != 0){
            rev = rev*10 + x%10;
            x /= 10;
            if(rev > Integer.MAX_VALUE || rev < Integer.MIN_VALUE) return 0;
        }
        return (int) rev;
    }
    
    //made it AC'ed on my own, cheers!
    public int reverse(int x) {
        if(x == 0) return 0;
        //save the first bit if it's a negative sign
        StringBuilder sb = new StringBuilder();
        sb.append(x);
        boolean negative = sb.toString().charAt(0) == '-' ? true : false;
        //use modulor and division and use long as the result type to avoid overflow
        long longX = (long) x;
        if(negative){
            //get rid of the first '-' bit
            String withoutNegativeSign = sb.substring(1).toString();
            longX = Long.parseLong(withoutNegativeSign);
        } 
        sb.setLength(0);
        long result = 0;
        if(negative){
            sb.append('-');
        } 
        while(longX != 0){
            sb.append(longX%10);
            longX /= 10;
        }
        result = Long.parseLong(sb.toString());
        System.out.println(result);//it's right here, but after converting it into an int, it overflowed to become a wrong number, how to handle this?
        //it turns out depending on the question requirement, on this OJ, it's expecting 0, if it's beyond the range of (Integer.MIN_VALUE, Integer.MAX_VALUE)
        return (result > Integer.MAX_VALUE || result < Integer.MIN_VALUE) ? 0 : (int) result;
    }
    
    public static void main(String...strings){
        ReverseInteger test = new ReverseInteger();
        //when the input is 1534236469, it's expecting 0 as the correct answer, this is due to its reversed number is greater than Integer.MAX_VALUE, thus return 0
        System.out.println(1534236469 > Integer.MAX_VALUE);
        System.out.println("1534236469\n" + Integer.MAX_VALUE);
//        System.out.println(test.reverse(-2147483648));
    }
    
    // this is not going to work when the input number's reverse version is greater than
    // Integer.MAX_VALUE, it'll throw NumberFormatException as Java cannot handle it, overflowed.
    public int reverse_overflowed(int x) {
        //save the first bit if it's a negative sign
        StringBuilder sb = new StringBuilder();
        sb.append(x);
        boolean negative = sb.toString().charAt(0) == '-' ? true : false;
        char[] bits = sb.toString().toCharArray();
        sb.setLength(0);
        if(negative){
            sb.append('-');
            //until i > 0
            for(int i = bits.length-1; i > 0; i--){
                sb.append(bits[i]);
            }
        } else {
            //until i >= 0
            for(int i = bits.length-1; i >= 0; i--){
                sb.append(bits[i]);
            }
        }
        return Integer.parseInt(sb.toString());
    }
    
}
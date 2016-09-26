package easy;
/**67. Add Binary  QuestionEditorial Solution  My Submissions
Total Accepted: 96848
Total Submissions: 337759
Difficulty: Easy
Given two binary strings, return their sum (also a binary string).

For example,
a = "11"
b = "1"
Return "100".*/
public class AddBinary {
    //then I turned to Discuss, this post is concise: https://discuss.leetcode.com/topic/13698/short-ac-solution-in-java-with-explanation
    //Tricks and things learned that could be learned:
    //1. use StringBuilder.reverse() function! Nice!
    //2. if a numeric number is represented/stored in String, how to get its value: use Character.getNumericValue(s.charAt(i))
    //3. directly adding/subtracting chars will end up working with their ASCII numbers, e.g. chars[0] = 'a', chars[1] = 'b', then chars[0] + chars[1] will become 195
    public String addBinary(String a, String b){
        int carry = 0, i = a.length()-1, j = b.length()-1;
        StringBuilder sb = new StringBuilder();
        while(i >= 0 || j >= 0){
            int sum = carry;
            if(i >= 0) sum += a.charAt(i--) - '0';
            if(j >= 0) sum += b.charAt(j--) - '0';
            sb.append(sum%2);
            carry = sum/2;
        }
        if(carry != 0) sb.append(carry);
        return sb.reverse().toString();
    }
    
    //my original lengthy but AC'ed solution
    public String addBinary_my_original_accepted_but_lengthy_solution(String a, String b) {
        char[] longer = (a.length() >= b.length()) ? a.toCharArray() : b.toCharArray();
        char[] shorter = (a.length() < b.length()) ? a.toCharArray() : b.toCharArray();
        //at the maximum, the result length will be Math.max(a.length, b.length)+1;
        //let's use Math.max() as the length first, if the most signifant bits add up to a carry, then we'll add one more bit
        char[] result = new char[longer.length];
        boolean carry = false;
        int i = longer.length-1, j = shorter.length-1;
        System.out.println(Character.getNumericValue(longer[i]) + Character.getNumericValue(shorter[j]));
        System.out.println((int) longer[i] + (int) shorter[j]);
        System.out.println(longer[i] + shorter[j]);
        System.out.println('a' + 'b');
        for(; i >= 0 || j >= 0; i--, j--){
            if(j < 0 && i >= 0){
                if(carry){
                    if(Character.getNumericValue(longer[i])+1 == 2){
                        result[i] = '0';
                        carry = true;
                    } else {
                        result[i] = '1';
                        carry = false;
                    }
                } else {
                    for(int k = i; k >= 0; k--){
                        result[k] = longer[k];
                    }
                    return new String(result);
                }
            } else if(Character.getNumericValue(longer[i]) + Character.getNumericValue(shorter[j]) == 2){
                if(carry){
                    result[i] = '1';
                } else {
                    result[i] = '0';
                }
                carry = true;
            } else if(Character.getNumericValue(longer[i]) + Character.getNumericValue(shorter[j]) == 1){
                if(carry){
                    result[i] = '0';
                    carry = true;
                } else {
                    result[i] = '1';
                    carry = false;
                }
            } else if(Character.getNumericValue(longer[i]) + Character.getNumericValue(shorter[j]) == 0){
                if(carry){
                    result[i] = '1';
                } else {
                    result[i] = '0';
                }
                carry = false;
            }
        }
        if(carry){
            char[] newResult = new char[longer.length+1];
            newResult[0] = '1';
            for(int k = 0; k < result.length; k++){
                newResult[k+1] = result[k];
            }
            return new String(newResult);
        }
        return new String(result);
    }
    
    public static void main(String...args){
        AddBinary test = new AddBinary();
//        String a = "0";
//        String b = "0";
//        String a = "11";
//        String b = "1";
//        String a = "100";
//        String b = "110010";
        
        String a = "101111";
        String b = "10";
        System.out.println(test.addBinary(a, b));
    }
}

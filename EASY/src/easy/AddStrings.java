package easy;

/**
 * Created by fishercoder1534 on 10/9/16.
 */
public class AddStrings {

    public static String addStrings(String num1, String num2) {
        if(num1 == null || num1.length() == 0) return num2;
        else if(num2 == null || num2.length() == 0) return num1;

        int i = num1.length()-1, j = num2.length()-1;
        long carry = 0, sum = 0;
        StringBuilder sb = new StringBuilder();
        char[] char1 = num1.toCharArray();
        char[] char2 = num2.toCharArray();
        while(i >= 0  || j >= 0){
            sum = carry;
            if(i >= 0) sum += Character.getNumericValue(char1[i--]);
            if(j >= 0) sum += Character.getNumericValue(char2[j--]);
            carry = sum/10;
            sb.append(sum%10);
        }
        if(carry != 0) sb.append(carry);

        return sb.reverse().toString();
    }

    public static void main(String...args){
//        String num1 = "123";
//        String num2 = "34567";

//        String num1 = "1";
//        String num2 = "9";

        String num1 = "9";
        String num2 = "99";
        System.out.println(addStrings(num1, num2));
    }
}

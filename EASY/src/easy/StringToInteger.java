package easy;

import java.util.HashSet;
/**8. String to Integer (atoi)  QuestionEditorial Solution  My Submissions
Total Accepted: 115114
Total Submissions: 839893
Difficulty: Easy
Implement atoi to convert a string to an integer.

Hint: Carefully consider all possible input cases. If you want a challenge, please do not see below and ask yourself what are the possible input cases.

Notes: It is intended for this problem to be specified vaguely (ie, no given input specs). You are responsible to gather all the input requirements up front.*/
import java.util.Set;

/**Requirements for atoi:
The function first discards as many whitespace characters as necessary until the first non-whitespace character is found. Then, starting from this character, takes an optional initial plus or minus sign followed by as many numerical digits as possible, and interprets them as a numerical value.

The string can contain additional characters after those that form the integral number, which are ignored and have no effect on the behavior of this function.

If the first sequence of non-whitespace characters in str is not a valid integral number, or if no such sequence exists because either str is empty or it contains only whitespace characters, no conversion is performed.

If no valid conversion could be performed, a zero value is returned. If the correct value is out of the range of representable values, INT_MAX (2147483647) or INT_MIN (-2147483648) is returned.*/
public class StringToInteger {
	public int myAtoi(String str) {
		//case 1: str is greater than Integer.MAX_VALUE, return Integer.MAX_VALUE as the question states it
		
		//case 2: str is smaller than Integer.MIN_VALUE, return Integer.MIN_VALUE as the question states it
		
		//case 3: str contains non-numeric values
		
		//case 4: there're many leading whitespace characters which we'll have to ignore
		
		//case 5: when finding the first non-whitespace character, it could possibly be a '+' or '-' sign, after that, we parse all the consecutive numbers
		
	    str = str.trim();//cut off its leading and trailing whitespace characters
	    if(str == null || str.isEmpty()) return 0;
	    Set<Character> numbers = new HashSet();
	    for(int i = 0; i < 10; i++){
	        numbers.add(Character.forDigit(i, 10));
	    }
	    
	    char[] chars = str.toCharArray();
	    StringBuilder sb = new StringBuilder();
	    boolean negative;
	    int i = 0;
	    if(chars[0] == '-') {
	        negative = true;
	        i++;//let i start from 1 in this case
	    }
	    else negative = false;
	    
	    //it might be a floating number, so consider '.'
	    int period = 0;
	    while(i < chars.length && numbers.contains(chars[i])){
	        if(chars[i] == '.') period++;
	        if(period > 1) break;
	        sb.append(chars[i++]);
	    }
	    
	    int result = 0;
	    if(period > 0){
	        //use Double to parse
	        try{
	            result = (int) Double.parseDouble(sb.toString());
	        } catch(Exception e){
	            System.out.println(e);
	        }
	    } else {
	        //use Integer to parse
	        try{
                result = Integer.parseInt(sb.toString());
            } catch(Exception e){
                System.out.println(e);
            }
	    }
	    
	    return result;
	}
	
	public static void main(String...strings){
	    StringToInteger test = new StringToInteger();
	    String str = "1";
	    System.out.println(test.myAtoi(str));
	    
	    
//	    System.out.println(Double.parseDouble("1.2098"));
//	    System.out.println(Integer.parseInt("123456789"));
	}
}

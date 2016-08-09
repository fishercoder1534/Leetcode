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
	//TODO: look at others' solutions
	
	//Eventually, made it AC'ed, lots of corner cases, but now, really felt much easier and the though process is super clear than the first time I tried to solve it which was 3~4 years ago from now. 8/9/2016
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
	    int minuSignCount = 0, plusSignCount = 0;
	    int i = 0;
	    while(i < chars.length){
	    	if(chars[i] == '-'){
	    		minuSignCount++;
	    		i++;
	    	} else if(chars[i] == '+'){
	    		plusSignCount++;
	    		i++;
	    	} else {
	    		break;
	    	}
	    }
	    if((plusSignCount > 0 && minuSignCount > 0) || minuSignCount > 1 || plusSignCount > 1) return 0;
	    negative = minuSignCount%2 != 0;
	    if(i >= chars.length) return 0;
	    
	    //it might be a floating number, so consider '.'
	    int period = 0;
	    while(i < chars.length && numbers.contains(chars[i])){
	        if(chars[i] == '.') period++;
	        if(period > 1) break;
	        sb.append(chars[i++]);
	    }
	    
	    if(sb == null || sb.length() == 0) return 0;
	    
	    int result = 0;
	    if(period > 0){
	        //use Double to parse
	        try{
	            result = (int) Double.parseDouble(sb.toString());
	        } catch(Exception e){
	            System.out.println(e);
	        }
	    } else {
	        //use Long to parse to handle integer overflow case
	        	long temp = 0;
	        	if(sb.length() >= Long.toString(Long.MAX_VALUE).length() && negative){
	        		return Integer.MIN_VALUE;
	        	} else if(sb.length() >= Long.toString(Long.MAX_VALUE).length() && !negative){
	        		return Integer.MAX_VALUE;
	        	} else {
		        	try{
		        		temp = Long.parseLong(sb.toString());
		        	} catch(Exception e){
		        		if(sb.length() >= Integer.MAX_VALUE) result = Integer.MAX_VALUE;
		        	}
		        	if(temp > (long) Integer.MAX_VALUE+1) {
		        		if(!negative)return Integer.MAX_VALUE;
		        		else return Integer.MIN_VALUE;
		        	}
		        	else if(temp == (long) Integer.MAX_VALUE+1 && negative) return Integer.MIN_VALUE;
		        	else if(temp == (long) Integer.MAX_VALUE+1) return Integer.MAX_VALUE;
		        	else if(temp < Integer.MIN_VALUE) result = Integer.MIN_VALUE;
		        	else result = (int) temp;
	        	}
	    }
	    
	    if(negative) result = -result;
	    return result;
	}
	
	public static void main(String...strings){
	    StringToInteger test = new StringToInteger();
//	    String str = "2147483648";
//	    String str = "+-2";//a really interesting test case, you never know how stupid one's input could be like, this is to challenge your program to be more robust. It's expecting to return 0 for this case which means it's not a valid number
//	    String str = "+";
//	    String str = "abc";
//	    String str = "1";
//	    String str = "-2147483648";
//	    String str = "++1";//I'm really amazed by OJ's test case variety, it's expecting 0 in this case
//	    String str = "-2147483649";
	    String str = "9223372036854775809";
	    System.out.println(test.myAtoi(str));
	    
	    
//	    System.out.println(Double.parseDouble("1.2098"));
//	    System.out.println(Integer.parseInt("123456789"));
	}
}

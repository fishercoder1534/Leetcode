package easy;
/**8. String to Integer (atoi)  QuestionEditorial Solution  My Submissions
Total Accepted: 115114
Total Submissions: 839893
Difficulty: Easy
Implement atoi to convert a string to an integer.

Hint: Carefully consider all possible input cases. If you want a challenge, please do not see below and ask yourself what are the possible input cases.

Notes: It is intended for this problem to be specified vaguely (ie, no given input specs). You are responsible to gather all the input requirements up front.*/

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
		return 0;
	}
}

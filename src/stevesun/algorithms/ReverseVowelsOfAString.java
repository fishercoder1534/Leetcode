package stevesun.algorithms;

import java.util.HashSet;
import java.util.Set;

public class ReverseVowelsOfAString {
	public String reverseVowels(String s) {
		StringBuilder sb = new StringBuilder(s);
		Set<Character> vowels = new HashSet();
		vowels.add('a');
		vowels.add('e');
		vowels.add('i');
		vowels.add('o');
		vowels.add('u');
		vowels.add('A');
		vowels.add('E');
		vowels.add('I');
		vowels.add('O');
		vowels.add('U');
		//use two pointers approach would be the fastest
		int i = 0, j = s.length()-1;
		while (i < j){
			char left = s.charAt(i), right = s.charAt(j);
			while(i < j && !vowels.contains(left)){
				i++;
				left = s.charAt(i);
			}
			while(i < j && !vowels.contains(right)){
				j--;
				right = s.charAt(j);
			}
			char temp = left;
			sb.setCharAt(i, right);
			sb.setCharAt(j, temp);
			i++; j--;
		}
		return sb.toString();
	}
	
	public static void main(String...strings){
		ReverseVowelsOfAString test = new ReverseVowelsOfAString();
		String s = "leetcode";
		System.out.println(test.reverseVowels(s));
	}
}

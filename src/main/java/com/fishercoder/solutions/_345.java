package com.fishercoder.solutions;

import java.util.HashSet;
import java.util.Set;

/**Write a function that takes a string as input and reverse only the vowels of a string.

 Example 1:
 Given s = "hello", return "holle".

 Example 2:
 Given s = "leetcode", return "leotcede".

 Note:
 The vowels does not include the letter "y".*/
public class _345 {
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
		int i = 0, j = s.length() - 1;
		while (i < j) {
			char left = s.charAt(i), right = s.charAt(j);
			while (i < j && !vowels.contains(left)) {
				i++;
				left = s.charAt(i);
			}
			while (i < j && !vowels.contains(right)) {
				j--;
				right = s.charAt(j);
			}
			char temp = left;
			sb.setCharAt(i, right);
			sb.setCharAt(j, temp);
			i++;
			j--;
		}
		return sb.toString();
	}

	public static void main(String... strings) {
		_345 test = new _345();
		String s = "leetcode";
		System.out.println(test.reverseVowels(s));
	}
}

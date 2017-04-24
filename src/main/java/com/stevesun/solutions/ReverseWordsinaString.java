package com.stevesun.solutions;
/**Given an input string, reverse the string word by word.

For example,
Given s = "the sky is blue",
return "blue is sky the".*/
public class ReverseWordsinaString {
    public String reverseWords(String s) {
        if(!s.contains(" ")) return s;//for cases like this: "a"
        if(s.matches(" *")) return "";//for cases like this: " "
        String[] words = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for(int i = words.length-1; i >= 0; i--){
            if(!words[i].equals("") && !words[i].equals(" ")){
                sb.append(words[i]);
                sb.append(" ");
            }
        }
        sb.deleteCharAt(sb.length()-1);
        return sb.toString();
    }
}

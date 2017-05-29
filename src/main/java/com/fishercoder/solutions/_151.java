package com.fishercoder.solutions;
/**Given an input string, reverse the string word by word.

For example,
Given s = "the sky is blue",
return "blue is sky the".*/

public class _151 {
    public String reverseWords(String s) {
        if(!s.contains(" ")) return s;//for cases like this: "a"
        if(s.matches(" *")) return "";//for cases like this: " "
        String[] words = s.split(" ");
        StringBuilder stringBuilder = new StringBuilder();
        for(int i = words.length-1; i >= 0; i--){
            if(!words[i].equals("") && !words[i].equals(" ")){
                stringBuilder.append(words[i]);
                stringBuilder.append(" ");
            }
        }
        stringBuilder.deleteCharAt(stringBuilder.length()-1);
        return stringBuilder.toString();
    }
}

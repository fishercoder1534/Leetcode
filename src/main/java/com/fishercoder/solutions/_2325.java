package com.fishercoder.solutions;

import java.util.HashMap;
import java.util.Map;

public class _2325 {
    public static class Solution1 {
        public String decodeMessage(String key, String message) {

            // put first occurrence of each char of key in hashmap, where <k,v> k = char in key, v = incremental a - z alphabets

            Map<Character, Character> bucket = new HashMap<>();
            char ch = 'a';
            char keyArr[] = key.toCharArray();
            StringBuilder result = new StringBuilder();

            for(int i = 0; i < keyArr.length; i++) {
                if (keyArr[i] != ' ' && !bucket.containsKey(keyArr[i])) {
                    bucket.put(keyArr[i], ch++);
                }
            }

            // decode the message using the bucket
            char msgArr[] = message.toCharArray();
            for(int i = 0; i < msgArr.length; i++) {
                if(msgArr[i] == ' ') result.append(" ");
                else result.append(bucket.get(msgArr[i]));
            }
            return result.toString();
        }
    }
}

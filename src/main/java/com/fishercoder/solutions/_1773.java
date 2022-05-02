package com.fishercoder.solutions;

import java.util.List;

public class _1773 {
    public static class Solution1 {
        public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
            int index =0;
            if(ruleKey.equals("color")){
                index =1;
            }
            if(ruleKey.equals("name")){
                index =2;
            }

            int match = 0;


            for (List<String> item : items) {
                if(item.get(index).equals(ruleValue)){
                    match++;
                }
            }
            return match;
        }
    }
}

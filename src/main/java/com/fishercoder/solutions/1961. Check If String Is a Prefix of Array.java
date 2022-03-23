package com.fishercoder.solutions;

public class _1961{
    public class Solution1 {
        public boolean isPrefixString(String s, String[] words) {

            String t="";
            int i=0;

            while(t.length()<s.length() && i<words.length){
                t+=words[i++];

                if(t.equals(s))
                    return true;
            }

            return false;

        }
    }
}
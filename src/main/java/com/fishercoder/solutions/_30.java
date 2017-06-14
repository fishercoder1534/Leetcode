package com.fishercoder.solutions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * You are given a string, s, and a list of words, words,
 * that are all of the same length.
 * Find all starting indices of substring(s) in s
 * that is a concatenation of each word in words exactly once and without any intervening characters.

 For example, given:
 s: "barfoothefoobarman"
 words: ["foo", "bar"]

 You should return the indices: [0,9].
 (order does not matter).
 */
public class _30 {

    public List<Integer> findSubstring(String S, String[] L) {
        ArrayList<Integer> res = new ArrayList();
        if(S == null || L == null || S.length() == 0 || L.length == 0){
            return res;
        }

        HashMap<String, Integer> map = new HashMap();
        for(int i = 0; i < L.length; i++){
            Integer val = map.get(L[i]);
            if(val == null){
                map.put(L[i], 1);
            }
            else{
                map.put(L[i], val + 1);
            }
        }
        HashMap<String, Integer> original = new HashMap();
        original = (HashMap<String, Integer>) map.clone();

		/* we use two start pointers, "start" means the real starting point,
		 * "tempStart" means the currently starting point for comparing, if one whole concatenation substring
		 * is found, then we assign (tempStart + wordLen) to start, otherwise, start++. */
        int start = 0;
        int tempStart = 0;
        int wordLen = L[0].length();
        int wholeWordLen = wordLen * L.length;
        for(; start <= S.length() - wholeWordLen; start++){
            map.clear();
            map = (HashMap<String, Integer>) original.clone();
            for(tempStart = start; tempStart < S.length(); tempStart += wordLen){
				/* assign start to tempStart, this is a very smart way of coding, learn and master it! */
                if(map.size() == 0){
                    break;
                }
                if( tempStart + wordLen > S.length()){
                    break;
                }
                String sub = S.substring(tempStart, tempStart + wordLen);
                Integer val = map.get(sub);

                if(val == null){
                    break;
                }
                else{
                    if(val == 1){
                        map.remove(sub);
                    }
                    else{
                        map.put(sub, val - 1);
                    }
                }
            }
            if(map.size() == 0){
                res.add(start);
            }
        }
        return res;
    }

}

package stevesun.algorithms;

/**
 * Created by fishercoder1534 on 10/3/16.
 */
public class MinimumWindowSubstring {

    public String minWindow(String s, String t) {
        int[] counts = new int[256];
        for(char c : t.toCharArray()){
            counts[c]++;
        }

        int start = 0, end = 0, minStart = 0, minLen = Integer.MAX_VALUE, counter = t.length();
        while(end < s.length()){
            if(counts[s.charAt(end)] > 0) counter--;

            counts[s.charAt(end)]--;
            end++;

            while(counter == 0){
                if(end-start < minLen){
                    minStart = start;
                    minLen = end-start;
                }
                counts[s.charAt(start)]++;
                if(counts[s.charAt(start)] > 0) counter++;
                start++;
            }
        }

        if(minLen == Integer.MAX_VALUE) return "";
        return s.substring(minStart, minStart+minLen);
    }

}

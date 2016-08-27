package easy;

import java.util.Arrays;

public class ValidAnagram {
    public boolean isAnagram_solution1(String s, String t) {
        //I even thought about using HashMap to compute their character frequencies respectively and then compare each entry of the two maps, but totally unnecessary.
        char[] schar = s.toCharArray();
        char[] tchar = t.toCharArray();
        Arrays.sort(schar);
        Arrays.sort(tchar);
        return new String(schar).equals(new String(tchar));
    }
    
    //another way: altough much slower
    public boolean isAnagram_solution2(String s, String t) {
        if(s == null || t == null || s.length() != t.length()) return false;
        int[] counts = new int[26];
        for(int i = 0; i < s.length(); i++){
            counts[s.charAt(i) - 'a']++;
            counts[t.charAt(i) - 'a']--;
        }
        for(int i : counts){
            if(i != 0) return false;
        }
        return true;
    }
}

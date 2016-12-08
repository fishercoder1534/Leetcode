package easy;
/**Implement strStr().

 Returns the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.

 */
public class ImplementStrStr {
/**You could use substring as follows, or use two pointers to go through the haystack, if substring API call is not allowed.*/
    public static int strStr(String haystack, String needle) {
        if(haystack == null || needle == null || haystack.length() < needle.length()) return -1;
        
        for(int i = 0; i <= haystack.length() - needle.length(); i++){
            if(haystack.substring(i, i+needle.length()).equals(needle)) return i;
        }
        return -1;
    }
    
    public static void main(String...args){
//        String haystack = "a";
//        String needle = "";
        
//        String haystack = "mississippi";
//        String needle = "a";
        
        String haystack = "a";
        String needle = "a";
        strStr(haystack, needle);
    }
}

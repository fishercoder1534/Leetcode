package easy;

public class ImplementStrStr {
/**You could use substring as follows, or use two pointers to go through the haystack, if substring API call is not allowed.*/
    public static int strStr(String haystack, String needle) {
        if(haystack == null || needle == null){
            return -1;
        }
        if(haystack.isEmpty()){
            return needle.isEmpty() ? 0 : -1;
        }
        if(needle.isEmpty()){
            return 0;
        }
        for(int i = 0; i < haystack.length() - needle.length()+1; i++){
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

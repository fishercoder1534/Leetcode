package easy;

public class ReverseString {
    public String reverseString_cheating(String s) {
        return new StringBuilder(s).reverse().toString();
    }
    
    public String reverseString(String s) {
        int i = 0, j = s.length()-1;
        char[] chars = s.toCharArray();
        while(i < j){
            char temp = chars[i];
            chars[i] = chars[j];
            chars[j] = temp;
            i++;
            j--;
        }
        StringBuilder sb = new StringBuilder();
        for(char c : chars){
            sb.append(c);
        }
        return sb.toString();
    }
}

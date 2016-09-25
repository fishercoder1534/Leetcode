package easy;

public class ExcelSheetColumnNumber {

    public static int titleToNumber(String s) {
        char[] c = s.toCharArray();
        int result = 0;
        for(int i = s.length()-1; i >= 0; i--){
            result += (c[i]-64)* ((int) Math.pow(26, s.length()-i-1));
        }
        
        return result;
    }
    
    public static void main(String...strings){
        String s = "AB";
        System.out.println(titleToNumber(s));
    }

}

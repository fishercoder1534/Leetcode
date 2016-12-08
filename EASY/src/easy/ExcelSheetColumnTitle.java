package easy;
/**168. Excel Sheet Column Title
 *
Given a positive integer, return its corresponding column title as appear in an Excel sheet.

For example:

    1 -> A
    2 -> B
    3 -> C
    ...
    26 -> Z
    27 -> AA
    28 -> AB */
public class ExcelSheetColumnTitle {
    public String convertToTitle_accepted(int n) {
        /**'Z' is the corner case, so we'll have to special case handling specially, also, we'll have to do (n-1)/26,
         * only when this is not equal to 1, we'll continue.*/
        StringBuilder sb = new StringBuilder();
        while(n != 0){
            int temp = n%26;
            if(temp == 0) sb.append("Z");
            else sb.append((char)(temp+64));
            n = (n-1)/26;
        }
        return sb.reverse().toString();
    }
    
    public String convertToTitle_accepted_more_beautiful(int n) {

        StringBuilder sb = new StringBuilder();
        while(n != 0){
            int temp = (n-1)%26;
            sb.append((char)(temp+65));
            n = (n-1)/26;
        }
        return sb.reverse().toString();
    
    }
    
    public static void main(String...strings){
        ExcelSheetColumnTitle test = new ExcelSheetColumnTitle();
//        int n = 28899;
//        int n = 1;
//        int n = 1000000001;
//        int n = 26;
//        int n = 27;
        int n = 28;
//        int n = 52;
//        int n = 53;
//        System.out.println((int) 'A');
//        System.out.println(1000000001/26);
//        System.out.println(25*26);
//        System.out.println(26*26);
//        System.out.println(27*26);
//        System.out.println(702%26);
//        System.out.println(702/26);
        System.out.println(Integer.parseInt(String.valueOf(26), 10));
        System.out.println(test.convertToTitle_accepted(n));
    }
    
}
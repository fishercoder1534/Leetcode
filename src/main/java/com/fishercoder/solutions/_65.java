package com.fishercoder.solutions;
/**65. Valid Number
Validate if a given string is numeric.

Some examples:
"0" => true
" 0.1 " => true
"abc" => false
"1 a" => false
"2e10" => true
Note: It is intended for the problem statement to be ambiguous. You should gather all requirements up front before implementing one.*/
public class _65 {
    //strip off all leading whitespaces until encounter the first number or period
    //after that, only one 'e' is allowed and one '.' is allowed
    //also, this string could be negative, don't miss this case
    public boolean isNumber(String s) {
        s = s.trim();
        if (s.isEmpty())
            return false;
        int eCount = 0, periodCount = 0, index = 0, numberCount = 0;
        while(index < s.length()) {
            if(s.charAt(index) == '.') periodCount++;
            if((s.charAt(index) == '-') || s.charAt(index) == '+' || s.charAt(index) == '.') index++;
            if(periodCount >= 2) return false;
            else break;
        }
        if(index >= s.length()) return false;
        while (index < s.length()) {
            if ((Character.getNumericValue(s.charAt(index)) < 10 && Character.getNumericValue(s
                    .charAt(index)) >= 0)) {
                index++;
                numberCount++;
                continue;
            } else if (s.charAt(index) == 'e') {
                if(eCount > 1 || numberCount == 0) return false;
                if (eCount < 2 && index != 0 && index != (s.length() - 1)) {
                    eCount++;
                } else if (index == (s.length() - 1) || index == 0)
                    return false;
                if(eCount > 1) return false;
                index++;
                //after 'e', there could be '+' or '-' as long as there are numbers after these two signs
                if(index < s.length() && (s.charAt(index) == '+' || s.charAt(index) == '-')) {
                    index++;
                    if(index >= s.length()) return false;
                    else continue;
                }
            } else if (s.charAt(index) == '.') {
                if(eCount >= 1) return false;
                if(index-1 >= 0 && (Character.getNumericValue(s.charAt(index-1)) >= 10 || Character.getNumericValue(s
                        .charAt(index-1)) < 0)){
                    if(s.charAt(index-1) == '+' || s.charAt(index-1) == '-') {
                        index++;
                        continue;
                    } else return false;
                }
                if(index+1 < s.length() && (Character.getNumericValue(s.charAt(index+1)) >= 10 || Character.getNumericValue(s
                        .charAt(index+1)) < 0)){
                    if(s.charAt(index+1) == 'e'){
                        index++;
                        continue;
                    }
                    return false;
                }
                if (periodCount < 2 && (index + 1 <= (s.length() - 1)) || index - 1 >= 0) {
                    index++;
                    periodCount++;
                }
                if (periodCount >= 2 || (index == 0 && index + 1 >= s.length()))
                    return false;
            } else
                return false;
        }
        return numberCount != 0;
    }
    
    public static void main(String...strings){
        _65 test = new _65();
//        String s = "1 a";
//        String s = "2e10";
//        String s = "abc";
//        String s = " 0.1 ";
//        String s = "0";
//        String s = "3.";
//        String s = "0e";
//        String s = "e9";
//        String s = "..";
//        String s = ".";
//        String s = " -.";//should be false
//        String s = ".e1";
//        String s = "1e.";
//        String s = "-1.";
//        String s = "+++";
//        String s = "3";
//        String s = "+.8";//should be true
//        String s = "46.e3";//should be true
//        String s = "6e6.5";//should be false, i.e. after e, there should be no period
//        String s = "6ee69";//should be false
//        String s = ".e1";//should be false, i.e. there needs to be a number before 'e' appears?
//        String s = ".e10";//should this be true then?
//        String s = " 005047e+6";
        String s = " 4e+";
        System.out.println(test.isNumber(s));
        
        Integer.parseInt(s);
    }
}

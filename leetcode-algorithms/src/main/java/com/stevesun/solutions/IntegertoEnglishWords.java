package com.stevesun.solutions;

/**
 * Convert a non-negative integer to its english words representation. Given input is guaranteed to be less than 231 - 1.

 For example,
 123 -> "One Hundred Twenty Three"
 12345 -> "Twelve Thousand Three Hundred Forty Five"
 1234567 -> "One Million Two Hundred Thirty Four Thousand Five Hundred Sixty Seven"
 Hint:

 Did you see a pattern in dividing the number into chunk of words? For example, 123 and 123000.
 Group the number by thousands (3 digits). You can write a helper function that takes a number less than 1000 and convert just that chunk to words.
 There are many edge cases. What are some good test cases? Does your code work with input such as 0? Or 1000010? (middle chunk is zero and should not be printed out)
 */
public class IntegertoEnglishWords {

    private String[] digit = new String[] {"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
    private String[] teen = new String[] {"Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
    private String[] ten = new String[] {"Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};
    private String[] thousand = new String[] {"Thousand", "Million", "Billion"};

    public String numberToWords(int num) {
        String ans;
        if (num == 0)
            return digit[num];

        ans = hundredHelper(num%1000);
        num = num/1000;
        int i = 0;
        while (i < 3 && num > 0) {
            if (num % 1000 > 0)
                ans = hundredHelper(num%1000) + thousand[i] + " " + ans;
            num = num/1000;
            i++;
        }

        return ans.trim();
    }

    public String hundredHelper(int num) {
        String nstr = "";
        if (num >= 100) {
            nstr = digit[num/100] + " Hundred ";
        }
        num = num%100;
        if (num >= 20) {
            if (num % 10 != 0)
                nstr = nstr + ten[num/10 - 2] + " " +  digit[num%10] + " ";
            else
                nstr = nstr + ten[num/10 - 2] + " ";
        } else if (num >= 10) {
            nstr = nstr + teen[num%10] + " ";
        } else if (num > 0){
            nstr = nstr + digit[num] + " ";
        }
        return nstr;
    }

}

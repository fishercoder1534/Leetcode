package medium;
import java.util.*;
/**
 * Created by fishercoder1534 on 10/3/16.
 */
public class LetterCombinationsofaPhoneNumber {

    public List<String> letterCombinations(String digits) {
        String[] digits2Letters = new String[]{"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

        List<String> result = new ArrayList();
        if(digits.length() == 0) return result;

        result.add("");//this line is important, otherwise result is empty and Java will default it to an empty String
        for(int i = 0; i < digits.length(); i++){
            result = combine(digits2Letters[digits.charAt(i)-'0'], result);
        }

        return result;
    }

    List<String> combine(String letters, List<String> result){
        List<String> newResult = new ArrayList();

        for(int i = 0; i < letters.length(); i++){
            for(String str : result){
                newResult.add(str + letters.charAt(i));
            }
        }

        return newResult;
    }

}

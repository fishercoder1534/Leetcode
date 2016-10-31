package medium;

import java.util.ArrayList;
import java.util.List;

import utils.CommonUtils;

public class GenerateParentheses {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList();
        backtrack(result, "", 0, 0, n);
        return result;
    }
    
    void backtrack(List<String> result, String str, int left, int right, int max){
        if(str.length() == max*2){
            result.add(str);
            return;
        }
        
        if(left < max){
            backtrack(result, str+"(", left+1, right, max);
        }
        
        if(right < left){
            backtrack(result, str+")", left, right+1, max);
        }
    }
    
    public static void main(String...args){
        GenerateParentheses test = new GenerateParentheses();
        int n = 3;
        List<String> result = test.generateParenthesis(n);
        CommonUtils.print(result);
    }
}

package stevesun.algorithms;
import java.util.*;
/**
 * Given a string s and a dictionary of words dict, add spaces in s to construct a sentence where each word is a valid dictionary word.

 Return all such possible sentences.

 For example, given
 s = "catsanddog",
 dict = ["cat", "cats", "and", "sand", "dog"].

 A solution is ["cats and dog", "cat sand dog"].

 */
public class WordBreakII {
    public List<String> wordBreak(String s, Set<String> wordDict) {
        return dfs(s, wordDict, new HashMap<String, ArrayList<String>>());
    }

    private List<String> dfs(String s, Set<String> wordDict,
                             HashMap<String, ArrayList<String>> map) {
        if(map.containsKey(s)){
            return map.get(s);
        }

        ArrayList<String> res = new ArrayList<String>();
        if(s.length() == 0){
            res.add("");
            return res;
        }

        for(String word : wordDict){
            if(s.startsWith(word)){
                List<String> subList = dfs(s.substring(word.length()), wordDict, map);
                for(String sub : subList){
                    res.add(word + (sub.length() == 0 ? "" : " ") + sub);
                }
            }
        }
        map.put(s, res);
        return res;
    }

    public static void main(String...strings){
        List<String> temp = new ArrayList<String>();
        System.out.println(temp);
        List<String> temp2 = new ArrayList<String>(temp);
        temp2.add("");
        System.out.println(temp2);

        WordBreakII test = new WordBreakII();
        Set<String> wordDict = new HashSet<>();
        wordDict.add("cat");
        wordDict.add("cats");
        wordDict.add("sand");
        wordDict.add("and");
        wordDict.add("dog");
        String s = "catsanddog";
//        List<String> list = test.wordBreak(s, wordDict);
        List<String> list = test.wordBreak(s, wordDict);
        for(String word : list){
            System.out.print(word + ", ");
        }
        System.out.println();
    }
}

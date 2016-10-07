package package1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ConcatenatedWordsII {
    /**The 2nd version of solution has these optimizations:

1. It uses a Trie data structure which is a best fit for a problem domain like this, it saves a lot of memory space: instead of using a HashSet, Trie could save all words with the same prefix into the same place. This same location advantage also speeds up the loop up process when searching a particular word/substring.
2. I implemented a remove() and undoRemove() method to mark one word off and on instead of creating a new copy of a HashSet to check every word. This is also a huge performance boost.

This is why it turns a 12 minutes run to 800 ms.*/
    
    public static void main(String...args){
        try {
          String FILE_PATH = "/Users/SteveSun/Google Drive/Developer/wordsforproblem.txt";
//          String FILE_PATH = "/Users/SteveSun/Google Drive/Developer/first30.txt";
//          String FILE_PATH = "/Users/SteveSun/Google Drive/Developer/first50.txt";
//          String FILE_PATH = "/Users/SteveSun/Google Drive/Developer/first100.txt";
//           String FILE_PATH = "/Users/SteveSun/Google Drive/Developer/test.txt";
          
          String OUTPUT_PATH = "/Users/SteveSun/Google Drive/Developer/output_wordsforproblem.txt";
//          String OUTPUT_PATH = "/Users/SteveSun/Google Drive/Developer/output_first30.txt";
//          String OUTPUT_PATH = "/Users/SteveSun/Google Drive/Developer/output_first50.txt";
//          String OUTPUT_PATH = "/Users/SteveSun/Google Drive/Developer/output_first1001.txt";
//           String OUTPUT_PATH = "/Users/SteveSun/Google Drive/Developer/output_testagain.txt";
          
            ConcatenatedWordsII test = new ConcatenatedWordsII();
            ResultType result = test.readFromFile(FILE_PATH);
            Set<String> words = result.wordDict;
            Integer maxWordLen = result.maxWordLen;
            TrieNode root = test.buildTrie(words);
            long startTime = System.currentTimeMillis();
            List<String> validConcatenatedWords = new ArrayList();
            for (String word : words) {
                if (word == null || word.length() == 0) continue;
                test.remove(word, root);/** every word is comprised of every word itself, thus this word itself needs to be removed first for checking it*/
                int n = word.length();
                boolean[] dp = new boolean[n + 1];
                dp[0] = true;

                for (int i = 1; i <= n; i++) {
                    for (int j = 1; j <= i && j <= maxWordLen; j++) {
                        if (!dp[i - j])
                            continue;

                        String subWord = word.substring(i - j, i);
                        if (test.contains(subWord, root)) {
                            dp[i] = true;
                            break;
                        }
                    }
                }

                if(dp[n]) validConcatenatedWords.add(word);
                test.undoRemove(word, root);
            }
            long finishTime = System.currentTimeMillis();
            long usedTime = finishTime - startTime;
        
            //Note: we're only interested in the first two longest words, so we can iterate through validConcatenatedWords once and find those two
            String firstLongest = "";
            String secondLongest = "";
            for(String word : validConcatenatedWords){
                if(word.length() > secondLongest.length()){
                    if(word.length() > firstLongest.length()) {
                        String temp = secondLongest;
                        secondLongest = firstLongest;
                        firstLongest = word;
                    } else {
                        secondLongest = word;
                    }
                }
            }
            //print out the result we're interested in: longest concatenated word, second concatenated word, and the total number of all concatenated words
            System.out.println("The longest concatenated word is: " + firstLongest + ",\nthe 2nd longest concatenated word is: "+
            secondLongest + "\nand there are a total of " + validConcatenatedWords.size() + " valid concatenated words in this given file.");

            //For a more verbose solution, I'm printing all words in descending order based on their lengths.
            sortAndWriteToFile(OUTPUT_PATH, validConcatenatedWords, usedTime);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void sortAndWriteToFile(String OUTPUT_PATH, List<String> validConcatenatedWords,
            long usedTime) throws IOException {
        Collections.sort(validConcatenatedWords, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.length() > o2.length()) {
                    return -1;
                } else if (o1.length() < o2.length()) {
                    return 1;
                } else {
                    return 0;
                }
            }
        });

        File file = new File(OUTPUT_PATH);

        if (!file.exists())
            file.createNewFile();

        FileWriter fw = new FileWriter(file.getAbsoluteFile());
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write("There's a total of " + validConcatenatedWords.size() + " valid concatenated words found in this file.\n");
        bw.write("It took " + usedTime + " ms to finish.\n");
        for (String word : validConcatenatedWords) {
            bw.write(word + "\n");
        }

        bw.close();
    }

    public TrieNode buildTrie(Set<String> words) {
        TrieNode root = new TrieNode();
        for(String word : words){
            char[] chars = word.toCharArray();
            TrieNode node = root;
            for(int i = 0; i < chars.length; i++){
                char c = chars[i];
                if(node.children[c - 'a'] == null){
                   node.children[c - 'a'] = new TrieNode();
                }
                node = node.children[c - 'a'];
            }
            node.isWord = true;
        }
        return root;
    }

    // Returns true if the word is in the trie.
    public boolean contains(String word, TrieNode root) {
        TrieNode node = root;
        for(int i = 0; i < word.length(); i++){
            if(node.children[word.charAt(i) - 'a'] == null) return false;
            node = node.children[word.charAt(i) - 'a'];
        }
        return node.isWord;
    }
    
    // mark that word on
    public void undoRemove(String word, TrieNode root) {
        TrieNode node = root;
        for(int i = 0; i < word.length(); i++){
            node = node.children[word.charAt(i) - 'a'];
        }
        node.isWord = true;
    }
    
    // mark that word off, we are not really deleting that word
    public void remove(String word, TrieNode root) {
        TrieNode node = root;
        for(int i = 0; i < word.length(); i++){
            node = node.children[word.charAt(i) - 'a'];
        }
        node.isWord = false;
    }

    class TrieNode {
        
        boolean isWord;
        TrieNode[] children = new TrieNode[26];
        
        // Initialize your data structure here.
        public TrieNode() {}
    }
    
    class ResultType {
        Set<String> wordDict;
        Integer maxWordLen;

        ResultType(Set<String> wordDict, Integer maxWordLen) {
            this.wordDict = wordDict;
            this.maxWordLen = maxWordLen;
        }
    }
    
    public ResultType readFromFile(String filePath) throws Exception {
        Set<String> wordDict = new HashSet<>();
        int maxWordLen = Integer.MIN_VALUE;
        try {
            BufferedReader br = new BufferedReader(new FileReader(filePath));
            try {
                StringBuilder sb = new StringBuilder();
                String line = br.readLine();

                while (line != null) {
                    String word = new String(line);
                    maxWordLen = (maxWordLen > word.length()) ? maxWordLen : word.length();
                    if (word.length() != 0)
                        wordDict.add(word.trim());
                    line = br.readLine();
                }
            } finally {
                br.close();
            }
        } finally {
            // print out or log error information reading input files
        }
        ResultType result = new ResultType(wordDict, maxWordLen);
        return result;
    }
}

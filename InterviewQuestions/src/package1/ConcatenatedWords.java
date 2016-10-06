package package1;

import java.util.*;
import java.io.*;

/**
 * There's a file called “words-for-problem.txt” which contains a sorted list of
 * approximately 173,000 words. The words are listed one word per line, do not contain spaces, and
 * are all lowercase.
 * 
 * Your task is to write a program that reads the file and provides the following:
 * the longest concatenated word (that is,the longest word that is comprised entirely of shorter words in the
 * file)
 * the 2nd longest concatenated word 
 * the total count of all the concatenated words in the file
 * 
 * For example, if the file contained:
 * 
 * cat
 * 
 * cats
 * 
 * catsdogcats
 * 
 * dog
 * 
 * dogcatsdog
 * 
 * hippopotamuses
 * 
 * rat
 * 
 * ratcatdogcat
 * 
 * the longest concatenated word would be 'ratcatdogcat' with 12 characters. ‘hippopotamuses’ is a
 * longer word, however it is not comprised entirely of shorter words in the list. The 2nd longest
 * concatenated word is ‘catsdogcats’ with 11 characters. The total number of concatenated words is 3.
 * Note that ‘cats’ is not a concatenated word because there is no word ‘s’ in the list.
 * 
 * Your solution
 * 
 * Please email your solution source code as attachments (zipped if more than 3 files). In addition,
 * please include the following details in the body of the email:
 * 
 * the longest and 2nd longest concatenated words
 * 
 * the total count of concatenated words in the file
 * 
 * the programming language(s) you used to complete the challenge
 */
public class ConcatenatedWords {
    public static void main(String... args) {
//        String FILE_PATH = "/Users/SteveSun/Google Drive/Developer/wordsforproblem.txt";
//        String FILE_PATH = "/Users/SteveSun/Google Drive/Developer/first30.txt";
//        String FILE_PATH = "/Users/SteveSun/Google Drive/Developer/first50.txt";
        String FILE_PATH = "/Users/SteveSun/Google Drive/Developer/first100.txt";
//         String FILE_PATH = "/Users/SteveSun/Google Drive/Developer/test.txt";
        
//        String OUTPUT_PATH = "/Users/SteveSun/Google Drive/Developer/output2.txt";
//        String OUTPUT_PATH = "/Users/SteveSun/Google Drive/Developer/output_first30.txt";
//        String OUTPUT_PATH = "/Users/SteveSun/Google Drive/Developer/output_first50.txt";
        String OUTPUT_PATH = "/Users/SteveSun/Google Drive/Developer/output_first100.txt";
//         String OUTPUT_PATH = "/Users/SteveSun/Google Drive/Developer/output_test.txt";
        ConcatenatedWords test = new ConcatenatedWords();
        test.doJob(FILE_PATH, OUTPUT_PATH);
    }

    public void doJob(String FILE_PATH, String OUTPUT_PATH) {
        try {
            long startTime = System.currentTimeMillis();
            ResultType result = readFromFile(FILE_PATH);
            Set<String> wordDict = result.wordDict;
            Integer maxWordLen = result.maxWordLen;
            List<String> validConcatenatedWords = findAllValidConcatenatedWords(wordDict,
                    maxWordLen);
            //Note: if we're only interested in the first two longest words, then we can iterate through validConcatenatedWords once
            //and find those two

            //For a more verbose solution, I'm printing all words in descending order based on their lengths.
            
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
            long finishTime = System.currentTimeMillis();
            long usedTime = finishTime - startTime;

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
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    private List<String> findAllValidConcatenatedWords(Set<String> wordDict, Integer maxWordLen) {
        List<String> validConcatenatedWords = new ArrayList();

        for (String word : wordDict) {
            if (isValid(wordDict, word, maxWordLen)) {
                validConcatenatedWords.add(word);
            }
        }

        return validConcatenatedWords;
    }

    private boolean isValid(final Set<String> wordDict, String s, int maxWordLen) {
        if (s == null || s.length() == 0)
            return false;
        Set<String> wordDictCopy = new HashSet(wordDict);
        wordDictCopy.remove(s);// every word is comprised of every word itself, thus this word
                               // itself needs to be removed first for checking it*/
        int n = s.length();
        boolean[] dp = new boolean[n + 1];
        dp[0] = true;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i && j <= maxWordLen; j++) {
                if (!dp[i - j])
                    continue;

                String word = s.substring(i - j, i);
                if (wordDictCopy.contains(word)) {
                    dp[i] = true;
                    break;
                }
            }
        }

        return dp[n];
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

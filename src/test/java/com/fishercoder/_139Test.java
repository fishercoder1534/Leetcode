package com.fishercoder;

import com.fishercoder.solutions._139;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static junit.framework.Assert.assertEquals;

public class _139Test {
    private static _139.ModifiedDPAndPruningSolution modifiedDpAndPruningSolution;
    private static String s;
    private static List<String> wordDict;

    @BeforeClass
    public static void setup(){
        modifiedDpAndPruningSolution = new _139.ModifiedDPAndPruningSolution();
    }

    @Test
    public void test1(){
        s = "leetcode";
        wordDict = new ArrayList<>(Arrays.asList("leet", "code"));
        assertEquals(true, modifiedDpAndPruningSolution.wordBreak(s, wordDict));
    }
}

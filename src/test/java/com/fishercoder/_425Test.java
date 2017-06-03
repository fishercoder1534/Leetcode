package com.fishercoder;

import com.fishercoder.solutions._425;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.List;

/**
 * Created by stevesun on 6/3/17.
 */
public class _425Test {
    private static _425 test;
    private static String[] words;

    @BeforeClass
    public static void setup(){
        test = new _425();
    }

    @Test
    public void test1(){
        words = new String[]{"area","lead","wall","lady","ball"};
        List<List<String>> result = test.wordSquares(words);
    }
}

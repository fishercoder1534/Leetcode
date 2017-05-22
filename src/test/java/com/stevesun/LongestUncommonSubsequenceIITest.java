package com.stevesun;

import com.stevesun.solutions.LongestUncommonSubsequenceII;
import org.junit.BeforeClass;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by stevesun on 12/31/16.
 */
public class LongestUncommonSubsequenceIITest {

    private static LongestUncommonSubsequenceII test;
    private static int expected;
    private static int actual;
    private static String[] strs;

    @BeforeClass
    public static void setup(){
        test = new LongestUncommonSubsequenceII();
    }

    @Test
    public void test1(){
        strs = new String[]{"aaa", "aaa", "aa"};
        expected = -1;
        actual = test.findLUSlength(strs);
        assertEquals(expected, actual);
    }

}

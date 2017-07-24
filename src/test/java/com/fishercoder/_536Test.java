package com.fishercoder;

import com.fishercoder.common.classes.TreeNode;
import com.fishercoder.solutions._536;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class _536Test {
    private static _536 test;
    private static TreeNode expected;
    private static TreeNode actual;
    private static String s;

    @BeforeClass
    public static void setup(){
        test = new _536();
    }

    @Before
    public void setupForEachTest(){
        expected = null;
        actual = null;
        s = "";
    }

    @Test
    public void test1(){
        s = "";
        expected = null;
        actual = test.str2tree(s);
        assertEquals(expected, actual);

    }
}

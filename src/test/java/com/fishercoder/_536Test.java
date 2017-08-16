package com.fishercoder;

import com.fishercoder.common.classes.TreeNode;
import com.fishercoder.solutions._536;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class _536Test {
    private static _536.Solution1 solution1;
    private static _536.Solution2 solution2;
    private static TreeNode expected;
    private static TreeNode actual;
    private static String s;

    @BeforeClass
    public static void setup(){
        solution1 = new _536.Solution1();
        solution2 = new _536.Solution2();
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
        actual = solution1.str2tree(s);
        assertEquals(expected, actual);

        actual = solution2.str2tree(s);
        assertEquals(expected, actual);
    }
}

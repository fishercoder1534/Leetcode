package com.fishercoder;

import com.fishercoder.common.classes.TreeNode;
import com.fishercoder.solutions.ConstructBinaryTreefromString;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class ConstructBinaryTreefromStringTest {
    private static ConstructBinaryTreefromString test;
    private static TreeNode expected;
    private static TreeNode actual;
    private static String s;

    @BeforeClass
    public static void setup(){
        test = new ConstructBinaryTreefromString();
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

package com.stevesun;

import com.stevesun.common.classes.TreeNode;
import com.stevesun.solutions.MinimumAbsoluteDifferenceinBST;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class MinimumAbsoluteDifferenceinBSTTest {
    private static MinimumAbsoluteDifferenceinBST test;
    private static int expected;
    private static int actual;
    private static TreeNode root;

    @BeforeClass
    public static void setup(){
        test = new MinimumAbsoluteDifferenceinBST();
    }

    @Before
    public void setupForEachTest(){
        expected = 0;
        actual = 0;
    }

    @Test
    public void test1(){
        root = new TreeNode(1);
        root.right = new TreeNode(3);
        root.right.left = new TreeNode(2);
        expected = 1;
        actual = test.getMinimumDifference(root);
        assertEquals(expected, actual);
    }

    @Test
    public void test2(){
        root = new TreeNode(1);
        root.right = new TreeNode(5);
        root.right.left = new TreeNode(3);
        expected = 2;
        actual = test.getMinimumDifference(root);
        assertEquals(expected, actual);
    }

//    [543,384,652,null,445,null,699]
    @Test
    public void test3() {
        root = new TreeNode(543);
        root.left = new TreeNode(384);
        root.right = new TreeNode(652);
        root.left.right = new TreeNode(445);
        root.right.right = new TreeNode(699);
        expected = 47;
        actual = test.getMinimumDifference(root);
        assertEquals(expected, actual);
    }
}

package com.stevesun;

import com.stevesun.common.classes.TreeNode;
import com.stevesun.solutions.BinaryTreeLongestConsecutiveSequenceII;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class BinaryTreeLongestConsecutiveSequenceIITest {
    private static BinaryTreeLongestConsecutiveSequenceII test;
    private static int expected;
    private static int actual;
    private static TreeNode root;

    @BeforeClass
    public static void setup(){
        test = new BinaryTreeLongestConsecutiveSequenceII();
    }

    @Before
    public void setupForEachTest(){
        root = null;
        actual = 0;
    }

    @Test
    public void test1(){
        root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        actual = test.longestConsecutive(root);
        expected = 2;
        assertEquals(expected, actual);
    }

    @Test
    public void test2(){
        root = new TreeNode(2);
        root.left = new TreeNode(1);
        root.right = new TreeNode(3);
        actual = test.longestConsecutive(root);
        expected = 3;
        assertEquals(expected, actual);
    }

    @Test
    public void test3(){
        root = new TreeNode(1);
        actual = test.longestConsecutive(root);
        expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    public void test4(){
        root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(3);
        root.left.left.left = new TreeNode(4);
        actual = test.longestConsecutive(root);
        expected = 4;
        assertEquals(expected, actual);
    }
}

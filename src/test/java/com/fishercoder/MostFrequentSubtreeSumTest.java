package com.fishercoder;

import com.fishercoder.common.classes.TreeNode;
import com.fishercoder.solutions.MostFrequentSubtreeSum;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class MostFrequentSubtreeSumTest {
    private static MostFrequentSubtreeSum test;
    private static int[] expected;
    private static int[] actual;
    private static TreeNode root;

    @BeforeClass
    public static void setup(){
        test = new MostFrequentSubtreeSum();
    }

    @Before
    public void setupForEachTest(){
        expected = new int[]{};
        actual = new int[]{};
        root = null;
    }

    @Test
    public void test1(){
        root = new TreeNode(5);
        root.left = new TreeNode(2);
        root.right = new TreeNode(-3);
        expected = new int[]{2,-3,4};
        actual = test.findFrequentTreeSum(root);
//        assertArrayEquals(expected, actual);
    }

    @Test
    public void test2(){
        root = new TreeNode(5);
        root.left = new TreeNode(2);
        root.right = new TreeNode(-5);
        expected = new int[]{2};
        actual = test.findFrequentTreeSum(root);
        assertArrayEquals(expected, actual);
    }
}

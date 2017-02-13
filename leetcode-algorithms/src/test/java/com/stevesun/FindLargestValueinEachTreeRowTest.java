package com.stevesun;

import com.stevesun.common.classes.TreeNode;
import com.stevesun.solutions.FindLargestValueinEachTreeRow;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class FindLargestValueinEachTreeRowTest {
    private static FindLargestValueinEachTreeRow test;
    private static int[] expected;
    private static int[] actual;
    private static TreeNode root;

    @BeforeClass
    public static void setup(){
        test = new FindLargestValueinEachTreeRow();
    }

    @Before
    public void setupForEachTest(){
        expected = new int[]{};
        actual = new int[]{};
        root = new TreeNode(0);
    }

    @Test
    public void test1(){
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(3);
        root.right= new TreeNode(2);
        expected = new int[]{1, 3};
        actual = test.largestValues(root);
        assertArrayEquals(expected, actual);

    }

    @Test
    public void test2(){
        expected = new int[]{};
        actual = test.largestValues(null);
        assertArrayEquals(expected, actual);

    }
}

package com.stevesun;

import com.stevesun.common.classes.TreeNode;
import com.stevesun.solutions.FindBottomLeftValue;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by stevesun on 1/15/17.
 */
public class FindBottomLeftValueTest {
    private static FindBottomLeftValue test;
    private static int expected;
    private static int actual;
    private static TreeNode root;

    @BeforeClass
    public static void setup(){
        test = new FindBottomLeftValue();
    }

    @Before
    public void setupForEachTest(){
        expected = 0;
        actual = 0;
        root = new TreeNode(0);
    }

    @Test
    public void test1(){
        TreeNode root = new TreeNode(2);
        root.left = new TreeNode(1);
        root.right= new TreeNode(3);
        expected = 1;
        actual = test.findBottomLeftValue(root);
        assertEquals(expected, actual);

    }

    @Test
    public void test2(){
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right= new TreeNode(3);
        root.left.left= new TreeNode(4);
        root.right.left= new TreeNode(5);
        root.right.right= new TreeNode(6);
        root.right.left.left= new TreeNode(7);
        expected = 7;
        actual = test.findBottomLeftValue(root);
        assertEquals(expected, actual);
    }
}

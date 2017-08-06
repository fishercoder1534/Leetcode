package com.fishercoder;

import com.fishercoder.common.classes.TreeNode;
import com.fishercoder.solutions._653;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class _653Test {
    private static _653.ListSolution listSolution;
    private static boolean expected;
    private static TreeNode root;

    @BeforeClass
    public static void setup(){
        listSolution = new _653.ListSolution();
    }

    @Before
    public void setupForEachTest(){
        root = null;
    }

    @Test
    public void test1(){
        root = new TreeNode(5);
        root.left = new TreeNode(3);
        root.left.left = new TreeNode(2);
        root.left.right = new TreeNode(4);
        root.right = new TreeNode(6);
        root.right.right = new TreeNode(7);
        expected = true;
        assertEquals(expected, listSolution.findTarget(root, 9));
    }

    @Test
    public void test2(){
        root = new TreeNode(2);
        root.left = new TreeNode(1);
        root.right = new TreeNode(3);
        expected = true;
        assertEquals(expected, listSolution.findTarget(root, 4));
    }

    @Test
    public void test3(){
        root = new TreeNode(1);
        expected = false;
        assertEquals(expected, listSolution.findTarget(root, 2));
    }

    @Test
    public void test4(){
        root = new TreeNode(2);
        root.left = new TreeNode(0);
        root.left.left = new TreeNode(-4);
        root.left.right = new TreeNode(1);
        root.right = new TreeNode(3);
        expected = true;
        assertEquals(expected, listSolution.findTarget(root, -1));
    }

    @Test
    public void test5(){
        TreeNode root = new TreeNode(2);
        root.left = new TreeNode(1);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(-4);
        root.left.left.right = new TreeNode(0);
        expected = true;
        assertEquals(expected, listSolution.findTarget(root, 2));
    }
}

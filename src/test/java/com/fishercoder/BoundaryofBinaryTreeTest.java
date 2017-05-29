package com.fishercoder;

import com.fishercoder.common.classes.TreeNode;
import com.fishercoder.solutions.BoundaryofBinaryTree;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static junit.framework.Assert.assertEquals;

public class BoundaryofBinaryTreeTest {
    private static BoundaryofBinaryTree test;
    private static List<Integer> expected;
    private static List<Integer> actual;
    private static TreeNode root;

    @BeforeClass
    public static void setup(){
        test = new BoundaryofBinaryTree();
    }

    @Before
    public void setupForEachTest(){}

    @Test
    public void test1(){
        root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);
        root.right.right = new TreeNode(4);
        actual = test.boundaryOfBinaryTree(root);
        expected = new ArrayList<>(Arrays.asList(1, 3, 4 ,2));
        assertEquals(expected, actual);
    }

    @Test
    public void test2(){
        root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.left.right.left = new TreeNode(7);
        root.left.right.right = new TreeNode(8);
        root.right = new TreeNode(3);
        root.right.left = new TreeNode(6);
        root.right.left.left = new TreeNode(9);
        root.right.left.right = new TreeNode(10);
        actual = test.boundaryOfBinaryTree(root);
        expected = new ArrayList<>(Arrays.asList(1, 2, 4, 7, 8, 9, 10, 6, 3));
        assertEquals(expected, actual);

    }

    @Test
    public void test3(){
        root = new TreeNode(1);
        actual = test.boundaryOfBinaryTree(root);
        expected = new ArrayList<>(Arrays.asList(1));
        assertEquals(expected, actual);
    }

    @Test
    public void test4(){
        root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(3);
        root.left.left.left= new TreeNode(4);
        actual = test.boundaryOfBinaryTree(root);
        expected = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        assertEquals(expected, actual);
    }

    @Test
    public void test5(){
        root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.right = new TreeNode(4);
        root.right = new TreeNode(3);
        root.right.left = new TreeNode(5);
        root.left.right.left = new TreeNode(6);
        root.left.right.right = new TreeNode(7);
        actual = test.boundaryOfBinaryTree(root);
        expected = new ArrayList<>(Arrays.asList(1,2,4,6,7,5,3));
        assertEquals(expected, actual);
    }
}

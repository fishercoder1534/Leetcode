package com.stevesun;

import com.stevesun.common.classes.TreeNode;
import com.stevesun.solutions._106;
import org.junit.BeforeClass;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by stevesun on 5/12/17.
 */
public class _106Test {
    private static _106 test;
    private static TreeNode expected;
    private static TreeNode actual;
    private static int[] inorder;
    private static int[] postorder;

    @BeforeClass
    public static void setup(){
        test = new _106();
    }

    @Test
    public void test1(){
        /**it should be a tree like this:
         *    3
         *   /
         *  1
         *   \
         *   2
         */
        inorder = new int[]{2,1,3};
        postorder = new int[]{1,2,3};
        actual = test.buildTree(postorder, inorder);
        expected = new TreeNode(3);
        expected.left = new TreeNode(1);
        expected.left.right = new TreeNode(2);
        assertEquals(expected, actual);
    }

    @Test
    public void test2(){
        /**it should be a tree like this:
         *    3
         *   /
         *  1
         *   \
         *   5
         *  /
         * 2
         *  \
         *  4
         */
        inorder = new int[]{4,2,5,1,3};
        postorder = new int[]{1,2,4,5,3};
        actual = test.buildTree(postorder, inorder);
        expected = new TreeNode(3);
        expected.left = new TreeNode(1);
        expected.left.right = new TreeNode(5);
        expected.left.right.left = new TreeNode(2);
        expected.left.right.left.right = new TreeNode(4);
        assertEquals(expected, actual);
    }
}

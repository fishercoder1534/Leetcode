package com.fishercoder;

import com.fishercoder.common.classes.TreeNode;
import com.fishercoder.solutions._538;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class _538Test {
    private static _538 test;
    private static TreeNode actualRoot;
    private static TreeNode expectedRoot;
    private static TreeNode root;

    @BeforeClass
    public static void setup(){
        test = new _538();
    }

    @Before
    public void setupForEachTest(){
    }

    @Test
    public void test1(){
        root = new TreeNode(5);
        root.left = new TreeNode(2);
        root.right = new TreeNode(13);

        expectedRoot = new TreeNode(18);
        expectedRoot.left = new TreeNode(20);
        expectedRoot.right = new TreeNode(13);
        actualRoot = test.convertBST(root);
        assertEquals(expectedRoot.toString(), actualRoot.toString());
    }

    @Test
    public void test2(){
        root = null;

        expectedRoot = null;
        actualRoot = test.convertBST(root);
        assertEquals(expectedRoot, actualRoot);
    }
}

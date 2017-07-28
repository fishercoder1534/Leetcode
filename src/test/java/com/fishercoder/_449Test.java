package com.fishercoder;

import com.fishercoder.common.classes.TreeNode;
import com.fishercoder.solutions._449;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class _449Test {
    private static _449 test;
    private static TreeNode actualRoot;
    private static TreeNode expectedRoot;

    @BeforeClass
    public static void setup(){
        test = new _449();
    }

    @Before
    public void setupForEachTest(){
    }

    @Test
    public void test1(){
        expectedRoot = new TreeNode(3);
        expectedRoot.left = new TreeNode(1);
        expectedRoot.right = new TreeNode(4);
        expectedRoot.left.right = new TreeNode(2);
        actualRoot = test.deserialize(test.serialize(expectedRoot));
        assertEquals(expectedRoot.toString(), actualRoot.toString());
    }
}

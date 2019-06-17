package com.fishercoder;

import com.fishercoder.common.classes.TreeNode;
import com.fishercoder.solutions._538;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class _538Test {
    private static _538.Solution2 solution2;
    private static _538.Solution1 solution1;
    private static TreeNode expectedRoot;
    private static TreeNode root;

    @BeforeClass
    public static void setup() {
        solution1 = new _538.Solution1();
        solution2 = new _538.Solution2();
    }

    @Before
    public void setupForEachTest() {
    }

    @Test
    public void test1() {
        root = new TreeNode(5);
        root.left = new TreeNode(2);
        root.right = new TreeNode(13);
        expectedRoot = new TreeNode(18);
        expectedRoot.left = new TreeNode(20);
        expectedRoot.right = new TreeNode(13);
        assertEquals(expectedRoot.toString(), solution2.convertBST(root).toString());
        assertEquals(expectedRoot.toString(), solution1.convertBST(root).toString());
    }

    @Test
    public void test2() {
        root = null;
        expectedRoot = null;
        assertEquals(expectedRoot, solution2.convertBST(root));
        assertEquals(expectedRoot, solution1.convertBST(root));
    }
}

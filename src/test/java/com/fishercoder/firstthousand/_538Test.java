package com.fishercoder.firstthousand;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.fishercoder.common.classes.TreeNode;
import com.fishercoder.solutions.firstthousand._538;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _538Test {
    private _538.Solution1 solution1;
    private _538.Solution2 solution2;
    private static TreeNode expectedRoot;
    private static TreeNode root;

    @BeforeEach
    public void setup() {
        solution1 = new _538.Solution1();
        solution2 = new _538.Solution2();
    }

    @Test
    public void test1() {
        root = new TreeNode(5);
        root.left = new TreeNode(2);
        root.right = new TreeNode(13);
        expectedRoot = new TreeNode(18);
        expectedRoot.left = new TreeNode(20);
        expectedRoot.right = new TreeNode(13);
        assertEquals(expectedRoot.toString(), solution1.convertBST(root).toString());
    }

    @Test
    public void test2() {
        root = new TreeNode(5);
        root.left = new TreeNode(2);
        root.right = new TreeNode(13);
        expectedRoot = new TreeNode(18);
        expectedRoot.left = new TreeNode(20);
        expectedRoot.right = new TreeNode(13);
        assertEquals(expectedRoot.toString(), solution2.convertBST(root).toString());
    }

    @Test
    public void test3() {
        root = null;
        expectedRoot = null;
        assertEquals(expectedRoot, solution1.convertBST(root));
        assertEquals(expectedRoot, solution2.convertBST(root));
    }
}

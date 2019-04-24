package com.fishercoder;

import com.fishercoder.common.classes.TreeNode;
import com.fishercoder.common.utils.TreeUtils;
import com.fishercoder.solutions._951;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class _951Test {
    private static _951.Solution1 solution1;

    @BeforeClass
    public static void setup() {
        solution1 = new _951.Solution1();
    }

    @Test
    public void test1() {
        TreeNode root1 = TreeUtils.constructBinaryTree(Arrays.asList(1, 2, 3, 4, 5, 6, null, null, null, 7, 8));
        TreeNode root2 = TreeUtils.constructBinaryTree(Arrays.asList(1, 3, 2, null, 6, 4, 5, null, null, null, null, 8, 7));
        assertTrue(solution1.flipEquiv(root1, root2));
    }

    @Test
    public void test2() {
        TreeNode root1 = TreeUtils.constructBinaryTree(Arrays.asList(1, 2, 3));
        TreeNode root2 = TreeUtils.constructBinaryTree(Arrays.asList(1, 2, 4));
        assertFalse(solution1.flipEquiv(root1, root2));
    }
}

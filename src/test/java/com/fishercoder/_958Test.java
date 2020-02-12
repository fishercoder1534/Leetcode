package com.fishercoder;

import com.fishercoder.common.classes.TreeNode;
import com.fishercoder.common.utils.TreeUtils;
import com.fishercoder.solutions._958;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.Arrays;

import static junit.framework.TestCase.assertEquals;

public class _958Test {
    private static _958.Solution1 solution1;

    @BeforeClass
    public static void setup() {
        solution1 = new _958.Solution1();
    }

    @Test
    public void test1() {
        TreeNode root = TreeUtils.constructBinaryTree(Arrays.asList(1, 2, 3, 4, 5, 6));
        assertEquals(true, solution1.isCompleteTree(root));
    }

    @Test
    public void test2() {
        TreeNode root = TreeUtils.constructBinaryTree(Arrays.asList(1, 2, 3, 4, 5, null, 7));
        assertEquals(false, solution1.isCompleteTree(root));
    }

    @Test
    public void test3() {
        TreeNode root = TreeUtils.constructBinaryTree(Arrays.asList(1, 2, 3, 4, 5, 8));
        assertEquals(true, solution1.isCompleteTree(root));
    }

}
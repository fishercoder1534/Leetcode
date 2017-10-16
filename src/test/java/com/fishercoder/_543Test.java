package com.fishercoder;

import com.fishercoder.common.classes.TreeNode;
import com.fishercoder.common.utils.TreeUtils;
import com.fishercoder.solutions._543;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.Arrays;

import static junit.framework.TestCase.assertEquals;

public class _543Test {
    private static _543.Solution1 solution1;
    private static TreeNode root;

    @BeforeClass
    public static void setup() {
        solution1 = new _543.Solution1();
    }

    @Test
    public void test1() {
        root = TreeUtils.constructBinaryTree(Arrays.asList(1, 2, 3, 4, 5));
        TreeUtils.printBinaryTree(root);
        assertEquals(3, solution1.diameterOfBinaryTree(root));
    }

}
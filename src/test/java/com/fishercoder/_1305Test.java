package com.fishercoder;

import com.fishercoder.common.classes.TreeNode;
import com.fishercoder.common.utils.TreeUtils;
import com.fishercoder.solutions._1305;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class _1305Test {
    private static _1305.Solution1 solution1;
    private static TreeNode root1;
    private static TreeNode root2;

    @BeforeClass
    public static void setup() {
        solution1 = new _1305.Solution1();
    }

    @Test
    public void test1() {
        root1 = TreeUtils.constructBinaryTree(Arrays.asList(2, 1, 4));
        root2 = TreeUtils.constructBinaryTree(Arrays.asList(1, 0, 3));
        assertEquals(Arrays.asList(0, 1, 1, 2, 3, 4), solution1.getAllElements(root1, root2));
    }

}
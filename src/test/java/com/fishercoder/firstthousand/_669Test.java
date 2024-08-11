package com.fishercoder.firstthousand;

import com.fishercoder.common.classes.TreeNode;
import com.fishercoder.common.utils.TreeUtils;
import com.fishercoder.solutions.firstthousand._669;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _669Test {
    private _669.Solution1 solution1;
    private static TreeNode root;
    private static TreeNode expected;

    @BeforeEach
    public void setup() {
        solution1 = new _669.Solution1();
    }

    @Test
    public void test1() {
        root = TreeUtils.constructBinaryTree(Arrays.asList(1, 0, 2));
        expected = TreeUtils.constructBinaryTree(Arrays.asList(1, null, 2));
        assertEquals(expected, solution1.trimBST(root, 1, 2));
    }

    @Test
    public void test2() {
        root = TreeUtils.constructBinaryTree(Arrays.asList(3, 0, 4, null, 2, null, null, 1));
        expected = TreeUtils.constructBinaryTree(Arrays.asList(3, 2, null, 1));
        assertEquals(expected, solution1.trimBST(root, 1, 3));
    }

}
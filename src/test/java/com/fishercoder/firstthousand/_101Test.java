package com.fishercoder.firstthousand;

import com.fishercoder.common.classes.TreeNode;
import com.fishercoder.common.utils.TreeUtils;
import com.fishercoder.solutions.firstthousand._101;

import java.util.Arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _101Test {
    private _101.Solution1 solution1;
    private _101.Solution2 solution2;
    private static TreeNode root;

    @BeforeEach
    public void setup() {
        solution1 = new _101.Solution1();
        solution2 = new _101.Solution2();
    }

    @Test
    public void test1() {
        root = TreeUtils.constructBinaryTree(Arrays.asList(1, 2, 2, 3, 4, 4, 3));
        assertEquals(true, solution1.isSymmetric(root));
        assertEquals(true, solution2.isSymmetric(root));
    }

    @Test
    public void test2() {
        root = TreeUtils.constructBinaryTree(Arrays.asList(1, 2, 2, null, 3, null, 3));
        assertEquals(false, solution1.isSymmetric(root));
        assertEquals(false, solution2.isSymmetric(root));
    }
}

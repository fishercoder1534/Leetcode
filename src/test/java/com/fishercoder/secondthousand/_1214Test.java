package com.fishercoder.secondthousand;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.fishercoder.common.classes.TreeNode;
import com.fishercoder.common.utils.TreeUtils;
import com.fishercoder.solutions.secondthousand._1214;
import java.util.Arrays;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _1214Test {
    private _1214.Solution1 solution1;
    private static TreeNode root1;
    private static TreeNode root2;

    @BeforeEach
    public void setup() {
        solution1 = new _1214.Solution1();
    }

    @Test
    public void test1() {
        root1 = TreeUtils.constructBinaryTree(Arrays.asList(2, 1, 4));
        root2 = TreeUtils.constructBinaryTree(Arrays.asList(1, 0, 3));
        assertEquals(true, solution1.twoSumBSTs(root1, root2, 5));
    }

    @Test
    public void test2() {
        root1 = TreeUtils.constructBinaryTree(Arrays.asList(0, -10, 10));
        root2 = TreeUtils.constructBinaryTree(Arrays.asList(5, 1, 7, 0, 2));
        assertEquals(false, solution1.twoSumBSTs(root1, root2, 18));
    }

    @Test
    public void test3() {
        root1 = TreeUtils.constructBinaryTree(Arrays.asList(0, -10, 10));
        root2 = TreeUtils.constructBinaryTree(Arrays.asList(5, 1, 7, 0, 2));
        assertEquals(true, solution1.twoSumBSTs(root1, root2, 17));
    }
}

package com.fishercoder.firstthousand;

import com.fishercoder.common.classes.TreeNode;
import com.fishercoder.common.utils.TreeUtils;
import com.fishercoder.solutions.firstthousand._437;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _437Test {
    private _437.Solution1 solution1;
    private _437.Solution2 solution2;

    @BeforeEach
    public void setUp() {
        solution1 = new _437.Solution1();
        solution2 = new _437.Solution2();
    }

    @Test
    public void test1() {
        TreeNode root = TreeUtils.constructBinaryTree(Arrays.asList(10, 5, -3, 3, 2, null, 11, 3, -2, null, 1)); // 3
        assertEquals(3, solution1.pathSum(root, 8));
    }

    @Test
    public void test2() {
        TreeNode root = TreeUtils.constructBinaryTree(Arrays.asList(10, 5, -3, 3, 2, null, 11, 3, -2, null, 1)); // 3
        assertEquals(3, solution2.pathSum(root, 8));
    }

}

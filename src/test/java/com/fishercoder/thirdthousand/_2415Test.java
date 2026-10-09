package com.fishercoder.thirdthousand;

import com.fishercoder.common.classes.TreeNode;
import com.fishercoder.common.utils.TreeUtils;
import com.fishercoder.solutions.thirdthousand._2415;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _2415Test {
    private _2415.Solution1 solution1;
    private _2415.Solution2 solution2;

    @BeforeEach
    public void setup() {
        solution1 = new _2415.Solution1();
        solution2 = new _2415.Solution2();
    }

    @Test
    public void test1() {
        TreeNode root = TreeUtils.constructBinaryTree(Arrays.asList(2, 3, 5, 8, 13, 21, 34));
        TreeNode expected = TreeUtils.constructBinaryTree(Arrays.asList(2, 5, 3, 8, 13, 21, 34));
        assertEquals(expected, solution1.reverseOddLevels(root));
    }

    @Test
    public void test2() {
        TreeNode root = TreeUtils.constructBinaryTree(Arrays.asList(2, 3, 5, 8, 13, 21, 34));
        TreeNode expected = TreeUtils.constructBinaryTree(Arrays.asList(2, 5, 3, 8, 13, 21, 34));
        assertEquals(expected, solution2.reverseOddLevels(root));
    }

}

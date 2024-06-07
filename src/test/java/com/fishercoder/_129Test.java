package com.fishercoder;

import com.fishercoder.common.classes.TreeNode;
import com.fishercoder.common.utils.TreeUtils;
import com.fishercoder.solutions._129;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _129Test {
    private static _129.Solution1 solution1;
    private static _129.Solution2 solution2;

    @BeforeEach
    public void setup() {
        solution1 = new _129.Solution1();
        solution2 = new _129.Solution2();
    }

    @Test
    public void test1() {
        TreeNode root = TreeUtils.constructBinaryTree(Arrays.asList(1, 2, 3));
        assertEquals(25, (solution1.sumNumbers(root)));
        assertEquals(25, (solution2.sumNumbers(root)));
    }

}

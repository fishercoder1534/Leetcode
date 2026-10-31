package com.fishercoder.fourththousand;

import com.fishercoder.common.classes.TreeNode;
import com.fishercoder.common.utils.TreeUtils;
import com.fishercoder.solutions.fourththousand._3831;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _3831Test {
    private _3831.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _3831.Solution1();
    }

    @Test
    public void test1() {
        TreeNode root = TreeUtils.constructBinaryTree(Arrays.asList(4, null, 5, null, 7));
        assertEquals(7, solution1.levelMedian(root, 2));
    }
}

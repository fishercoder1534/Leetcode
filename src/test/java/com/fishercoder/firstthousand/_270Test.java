package com.fishercoder.firstthousand;

import com.fishercoder.common.classes.TreeNode;
import com.fishercoder.common.utils.TreeUtils;
import com.fishercoder.solutions.firstthousand._270;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _270Test {
    private _270.Solution1 solution1;
    private static int expected;
    private static TreeNode root;
    private static double target;

    @BeforeEach
    public void setup() {
        solution1 = new _270.Solution1();
    }

    @Test
    public void test1() {
        root = TreeUtils.constructBinaryTree(Arrays.asList(4, 2, 5, 1, 3));
        expected = 4;
        target = 3.714286;
        assertEquals(expected, solution1.closestValue(root, target));
    }

}

package com.fishercoder.secondthousand;

import com.fishercoder.common.classes.TreeNode;
import com.fishercoder.common.utils.TreeUtils;
import com.fishercoder.solutions.secondthousand._1161;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _1161Test {
    private _1161.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _1161.Solution1();
    }

    @Test
    public void test1() {
        TreeNode root = TreeUtils.constructBinaryTree(Arrays.asList(1, 7, 0, 7, -8, null, null));
        assertEquals(2, solution1.maxLevelSum(root));
    }
}

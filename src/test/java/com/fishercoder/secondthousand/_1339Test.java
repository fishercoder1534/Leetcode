package com.fishercoder.secondthousand;

import com.fishercoder.common.classes.TreeNode;
import com.fishercoder.common.utils.TreeUtils;
import com.fishercoder.solutions.secondthousand._1339;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _1339Test {
    private static _1339.Solution1 solution1;
    private static _1339.Solution2 solution2;
    private static TreeNode root;

    @BeforeEach
    public void setup() {
        solution1 = new _1339.Solution1();
        solution2 = new _1339.Solution2();
    }

    @Test
    public void test1() {
        root = TreeUtils.constructBinaryTree(Arrays.asList(1, 2, 3, 4, 5, 6));
        assertEquals(110, solution1.maxProduct(root));
    }

    @Test
    public void test2() {
        root = TreeUtils.constructBinaryTree(Arrays.asList(1, 2, 3, 4, 5, 6));
        assertEquals(110, solution2.maxProduct(root));
    }

}
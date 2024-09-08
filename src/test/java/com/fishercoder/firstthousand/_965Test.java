package com.fishercoder.firstthousand;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.fishercoder.common.classes.TreeNode;
import com.fishercoder.common.utils.TreeUtils;
import com.fishercoder.solutions.firstthousand._965;
import java.util.Arrays;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _965Test {
    private _965.Solution1 solution1;
    private static TreeNode root;

    @BeforeEach
    public void setUp() {
        solution1 = new _965.Solution1();
    }

    @Test
    public void test1() {
        root = TreeUtils.constructBinaryTree(Arrays.asList(1, 1, 1, 1, 1, null, 1));
        assertEquals(true, solution1.isUnivalTree(root));
    }

    @Test
    public void test2() {
        root = TreeUtils.constructBinaryTree(Arrays.asList(2, 2, 2, 5, 2));
        assertEquals(false, solution1.isUnivalTree(root));
    }
}

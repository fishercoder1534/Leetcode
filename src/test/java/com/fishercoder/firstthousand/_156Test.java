package com.fishercoder.firstthousand;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.fishercoder.common.classes.TreeNode;
import com.fishercoder.common.utils.TreeUtils;
import com.fishercoder.solutions.firstthousand._156;
import java.util.Arrays;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _156Test {
    private _156.Solution1 solution1;
    private static TreeNode root;
    private static TreeNode expected;

    @BeforeEach
    public void setup() {
        solution1 = new _156.Solution1();
    }

    @Test
    public void test1() {
        root = TreeUtils.constructBinaryTree(Arrays.asList(1, 2, 3, 4, 5));
        expected = TreeUtils.constructBinaryTree(Arrays.asList(4, 5, 2, null, null, 3, 1));
        assertEquals(expected, solution1.upsideDownBinaryTree(root));
    }
}

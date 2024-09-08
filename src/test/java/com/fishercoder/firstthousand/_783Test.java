package com.fishercoder.firstthousand;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.fishercoder.common.classes.TreeNode;
import com.fishercoder.common.utils.TreeUtils;
import com.fishercoder.solutions.firstthousand._783;
import java.util.Arrays;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _783Test {
    private _783.Solution1 solution1;
    private static TreeNode root;

    @BeforeEach
    public void setUp() {
        solution1 = new _783.Solution1();
    }

    @Test
    public void test1() {
        root = TreeUtils.constructBinaryTree(Arrays.asList(4, 2, 6, 1, 3, null, null));
        TreeUtils.printBinaryTree(root);
        assertEquals(1, solution1.minDiffInBST(root));
    }
}

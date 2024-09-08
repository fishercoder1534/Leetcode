package com.fishercoder.thirdthousand;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.fishercoder.common.classes.TreeNode;
import com.fishercoder.common.utils.TreeUtils;
import com.fishercoder.solutions.thirdthousand._2265;
import java.util.Arrays;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _2265Test {
    private _2265.Solution1 solution1;
    private static TreeNode root;

    @BeforeEach
    public void setup() {
        solution1 = new _2265.Solution1();
    }

    @Test
    public void test1() {
        root = TreeUtils.constructBinaryTree(Arrays.asList(4, 8, 5, 0, 1, null, 6));
        TreeUtils.printBinaryTree(root);
        assertEquals(5, solution1.averageOfSubtree(root));
    }
}

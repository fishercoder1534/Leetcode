package com.fishercoder.secondthousand;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.fishercoder.common.classes.TreeNode;
import com.fishercoder.common.utils.TreeUtils;
import com.fishercoder.solutions.secondthousand._1022;
import java.util.Arrays;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _1022Test {
    private _1022.Solution1 solution1;
    private static TreeNode root;

    @BeforeEach
    public void setup() {
        solution1 = new _1022.Solution1();
    }

    @Test
    public void test1() {
        root = TreeUtils.constructBinaryTree(Arrays.asList(1, 0, 1, 0, 1, 0, 1));
        TreeUtils.printBinaryTree(root);
        assertEquals(22, solution1.sumRootToLeaf(root));
    }
}

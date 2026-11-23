package com.fishercoder.firstthousand;

import com.fishercoder.common.classes.TreeNode;
import com.fishercoder.common.utils.TreeUtils;
import com.fishercoder.solutions.firstthousand._236;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _236Test {
    private _236.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _236.Solution1();
    }

    @Test
    public void test1() {
        TreeNode rootNode = TreeUtils.constructBinaryTree(Arrays.asList(3, 5, 1, 6, 2, 0, 8, null, null, 7, 4));
        TreeUtils.printBinaryTree(rootNode);
        TreeNode actualNode = solution1.lowestCommonAncestor(rootNode, rootNode.left, rootNode.right);
        TreeUtils.printBinaryTree(actualNode);
        assertEquals(rootNode, actualNode);
    }
}

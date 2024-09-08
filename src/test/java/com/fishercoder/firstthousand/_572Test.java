package com.fishercoder.firstthousand;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.fishercoder.common.classes.TreeNode;
import com.fishercoder.common.utils.TreeUtils;
import com.fishercoder.solutions.firstthousand._572;
import java.util.Arrays;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _572Test {
    private _572.Solution1 solution1;
    private static boolean expected;
    private static TreeNode root;
    private static TreeNode subRoot;

    @BeforeEach
    public void setup() {
        solution1 = new _572.Solution1();
    }

    @Test
    public void test1() {
        root = TreeUtils.constructBinaryTree(Arrays.asList(3, 4, 5, 1, 2));
        TreeUtils.printBinaryTree(root);
        subRoot = TreeUtils.constructBinaryTree(Arrays.asList(4, 1, 2));
        expected = true;
        assertEquals(expected, solution1.isSubtree(root, subRoot));
    }

    @Test
    public void test2() {
        root =
                TreeUtils.constructBinaryTree(
                        Arrays.asList(3, 4, 5, 1, 2, null, null, null, null, 0));
        TreeUtils.printBinaryTree(root);
        subRoot = TreeUtils.constructBinaryTree(Arrays.asList(4, 1, 2));
        expected = false;
        assertEquals(expected, solution1.isSubtree(root, subRoot));
    }
}

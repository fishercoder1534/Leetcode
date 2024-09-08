package com.fishercoder.firstthousand;

import com.fishercoder.common.classes.TreeNode;
import com.fishercoder.common.utils.TreeUtils;
import com.fishercoder.solutions.firstthousand._114;
import java.util.Arrays;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _114Test {
    private _114.Solution1 solution1;
    private static TreeNode root;

    @BeforeEach
    public void setUp() {
        solution1 = new _114.Solution1();
    }

    @Test
    public void test1() {
        root = TreeUtils.constructBinaryTree(Arrays.asList(1, 2, 5, 3, 4, null, 6));
        TreeUtils.printBinaryTree(root);
        solution1.flatten(root);
        TreeUtils.printBinaryTree(root);
    }
}

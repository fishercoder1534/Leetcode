package com.fishercoder.firstthousand;

import com.fishercoder.common.classes.TreeNode;
import com.fishercoder.common.utils.TreeUtils;
import com.fishercoder.solutions.firstthousand._814;
import java.util.Arrays;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _814Test {
    private _814.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _814.Solution1();
    }

    @Test
    public void test1() {
        TreeUtils.printBinaryTree(
                solution1.pruneTree(
                        TreeUtils.constructBinaryTree(Arrays.asList(1, null, 0, 0, 1))));
    }

    @Test
    public void test2() {
        TreeNode root = TreeUtils.constructBinaryTree(Arrays.asList(1, 0, 1, 0, 0, 0, 1));
        TreeUtils.printBinaryTree(root);
        TreeUtils.printBinaryTree(solution1.pruneTree(root));
    }
}

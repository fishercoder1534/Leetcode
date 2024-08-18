package com.fishercoder.firstthousand;

import static org.junit.jupiter.api.Assertions.*;

import com.fishercoder.common.classes.TreeNode;
import com.fishercoder.common.utils.TreeUtils;
import com.fishercoder.solutions.firstthousand._100;
import java.util.Arrays;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _100Test {
    private _100.Solution1 solution1;
    private static TreeNode p;
    private static TreeNode q;

    @BeforeEach
    public void setup() {
        solution1 = new _100.Solution1();
    }

    @Test
    public void test1() {
        p = TreeUtils.constructBinaryTree(Arrays.asList(1, 2, 3));
        TreeUtils.printBinaryTree(p);
        q = TreeUtils.constructBinaryTree(Arrays.asList(1, 2, 3));
        TreeUtils.printBinaryTree(p);
        assertTrue(solution1.isSameTree(p, q));
    }

    @Test
    public void test2() {
        p = TreeUtils.constructBinaryTree(Arrays.asList(1, 2));
        TreeUtils.printBinaryTree(p);
        q = TreeUtils.constructBinaryTree(Arrays.asList(1, null, 2));
        TreeUtils.printBinaryTree(p);
        assertFalse(solution1.isSameTree(p, q));
    }

    @Test
    public void test3() {
        p = TreeUtils.constructBinaryTree(Arrays.asList(1, 2, 1));
        TreeUtils.printBinaryTree(p);
        q = TreeUtils.constructBinaryTree(Arrays.asList(1, 1, 2));
        TreeUtils.printBinaryTree(p);
        assertFalse(solution1.isSameTree(p, q));
    }
}

package com.fishercoder.firstthousand;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.fishercoder.common.classes.TreeNode;
import com.fishercoder.solutions.firstthousand._230;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/** Created by fishercoder on 5/19/17. */
public class _230Test {
    private _230.Solution1 solution1;
    private static TreeNode root;
    private static int k;

    @BeforeEach
    public void setup() {
        solution1 = new _230.Solution1();
    }

    @Test
    public void test1() {
        root = new TreeNode(1);
        k = 1;
        assertEquals(1, solution1.kthSmallest(root, k));
    }

    @Test
    public void test2() {
        root = new TreeNode(2);
        root.left = new TreeNode(1);
        k = 1;
        assertEquals(1, solution1.kthSmallest(root, k));
    }
}

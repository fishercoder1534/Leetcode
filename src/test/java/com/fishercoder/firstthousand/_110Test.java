package com.fishercoder.firstthousand;

import com.fishercoder.common.classes.TreeNode;
import com.fishercoder.common.utils.TreeUtils;
import com.fishercoder.solutions.firstthousand._110;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _110Test {
    private _110.Solution1 solution1;
    private _110.Solution2 solution2;
    private static TreeNode treeNode;

    @BeforeEach
    public void setup() {
        solution1 = new _110.Solution1();
        solution2 = new _110.Solution2();
    }

    @Test
    public void test1() {
        treeNode = TreeUtils.constructBinaryTree(Arrays.asList(3, 9, 20, null, null, 15, 7));
        assertEquals(true, solution1.isBalanced(treeNode));
    }

    @Test
    public void test2() {
        treeNode = TreeUtils.constructBinaryTree(Arrays.asList(3, 9, 20, null, null, 15, 7));
        assertEquals(true, solution2.isBalanced(treeNode));
    }

    @Test
    public void test3() {
        treeNode = TreeUtils.constructBinaryTree(Arrays.asList(1, 2, 2, 3, 3, null, null, 4, 4));
        assertEquals(false, solution1.isBalanced(treeNode));
    }

    @Test
    public void test4() {
        treeNode = TreeUtils.constructBinaryTree(Arrays.asList(1, 2, 2, 3, 3, null, null, 4, 4));
        assertEquals(false, solution2.isBalanced(treeNode));
    }


}
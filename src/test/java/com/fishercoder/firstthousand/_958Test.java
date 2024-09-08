package com.fishercoder.firstthousand;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.fishercoder.common.classes.TreeNode;
import com.fishercoder.common.utils.TreeUtils;
import com.fishercoder.solutions.firstthousand._958;
import java.util.Arrays;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _958Test {
    private _958.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _958.Solution1();
    }

    @Test
    public void test1() {
        TreeNode root = TreeUtils.constructBinaryTree(Arrays.asList(1, 2, 3, 4, 5, 6));
        assertEquals(true, solution1.isCompleteTree(root));
    }

    @Test
    public void test2() {
        TreeNode root = TreeUtils.constructBinaryTree(Arrays.asList(1, 2, 3, 4, 5, null, 7));
        assertEquals(false, solution1.isCompleteTree(root));
    }

    @Test
    public void test3() {
        TreeNode root = TreeUtils.constructBinaryTree(Arrays.asList(1, 2, 3, 4, 5, 8));
        assertEquals(true, solution1.isCompleteTree(root));
    }
}

package com.fishercoder.firstthousand;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.fishercoder.common.classes.TreeNode;
import com.fishercoder.common.utils.TreeUtils;
import com.fishercoder.solutions.firstthousand._129;
import java.util.Arrays;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _129Test {
    private _129.Solution1 solution1;
    private _129.Solution2 solution2;

    @BeforeEach
    public void setup() {
        solution1 = new _129.Solution1();
        solution2 = new _129.Solution2();
    }

    @Test
    public void test1() {
        TreeNode root = TreeUtils.constructBinaryTree(Arrays.asList(1, 2, 3));
        assertEquals(25, (solution1.sumNumbers(root)));
        assertEquals(25, (solution2.sumNumbers(root)));
    }
}

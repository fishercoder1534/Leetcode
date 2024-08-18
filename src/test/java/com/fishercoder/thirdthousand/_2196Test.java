package com.fishercoder.thirdthousand;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.fishercoder.common.classes.TreeNode;
import com.fishercoder.common.utils.TreeUtils;
import com.fishercoder.solutions.thirdthousand._2196;
import java.util.Arrays;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _2196Test {
    private _2196.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _2196.Solution1();
    }

    @Test
    public void test1() {
        TreeNode expected = TreeUtils.constructBinaryTree(Arrays.asList(50, 20, 80, 15, 17, 19));
        TreeUtils.printBinaryTree(expected);
        TreeNode actual =
                solution1.createBinaryTree(
                        new int[][] {
                            {20, 15, 1}, {20, 17, 0}, {50, 20, 1}, {50, 80, 0}, {80, 19, 1}
                        });
        TreeUtils.printBinaryTree(actual);
        assertEquals(expected, actual);
    }
}

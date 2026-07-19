package com.fishercoder.fourththousand;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.fishercoder.common.utils.TreeUtils;
import com.fishercoder.solutions.fourththousand._3997;
import java.util.Arrays;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _3997Test {
    private _3997.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _3997.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(
                5,
                solution1.countDominantNodes(
                        TreeUtils.constructBinaryTree(Arrays.asList(5, 3, 8, 2, 4, 7, 1))));
    }

    @Test
    public void test2() {
        assertEquals(
                4,
                solution1.countDominantNodes(
                        TreeUtils.constructBinaryTree(Arrays.asList(1, 2, 3, 1, 2))));
    }
}

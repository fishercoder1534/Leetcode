package com.fishercoder;

import com.fishercoder.common.utils.TreeUtils;
import com.fishercoder.solutions._2385;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _2385Test {
    private static _2385.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _2385.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(4, solution1.amountOfTime(TreeUtils.constructBinaryTree(Arrays.asList(1, 5, 3, null, 4, 10, 6, 9, 2)), 3));
    }

    @Test
    public void test2() {
        assertEquals(1, solution1.amountOfTime(TreeUtils.constructBinaryTree(Arrays.asList(2, 5)), 5));
    }

}

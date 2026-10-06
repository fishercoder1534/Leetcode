package com.fishercoder.fourththousand;

import com.fishercoder.common.utils.TreeUtils;
import com.fishercoder.solutions.fourththousand._3902;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _3902Test {
    private _3902.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _3902.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(Arrays.asList(5L, 8L, 0L), solution1.zigzagLevelSum(TreeUtils.constructBinaryTree(Arrays.asList(5, 2, 8, 1, null, 9, 6))));
    }

    @Test
    public void test2() {
        assertEquals(Arrays.asList(-639L, 865L, 731L, 0L), solution1.zigzagLevelSum(TreeUtils.constructBinaryTree(Arrays.asList(-639, -6, 871, 815, -925, 348, 493, -301, 703, 567, -670, 121, -435, 23, 31))));
    }

}

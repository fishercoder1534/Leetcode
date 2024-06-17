package com.fishercoder;

import com.fishercoder.common.utils.TreeUtils;
import com.fishercoder.solutions.first_thousand._337;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _337Test {
    private static _337.Solution1 solution1;
    private static _337.Solution2 solution2;

    @BeforeEach
    public void setup() {
        solution1 = new _337.Solution1();
        solution2 = new _337.Solution2();
    }

    @Test
    public void test1() {
        assertEquals(7, solution1.rob(TreeUtils.constructBinaryTree(Arrays.asList(3, 2, 3, null, 3, null, 1))));
        assertEquals(7, solution2.rob(TreeUtils.constructBinaryTree(Arrays.asList(3, 2, 3, null, 3, null, 1))));
    }

}
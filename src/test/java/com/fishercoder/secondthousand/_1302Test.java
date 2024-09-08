package com.fishercoder.secondthousand;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.fishercoder.common.utils.TreeUtils;
import com.fishercoder.solutions.secondthousand._1302;
import java.util.Arrays;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _1302Test {
    private _1302.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _1302.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(
                15,
                solution1.deepestLeavesSum(
                        TreeUtils.constructBinaryTree(
                                Arrays.asList(
                                        1, 2, 3, 4, 5, null, 6, 7, null, null, null, null, 8))));
    }
}

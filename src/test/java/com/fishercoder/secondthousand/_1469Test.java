package com.fishercoder.secondthousand;

import com.fishercoder.common.utils.TreeUtils;
import com.fishercoder.solutions.secondthousand._1469;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _1469Test {
    private _1469.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _1469.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(Arrays.asList(4), solution1.getLonelyNodes(TreeUtils.constructBinaryTree(Arrays.asList(1, 2, 3, null, 4))));
    }

    @Test
    public void test2() {
        assertEquals(Arrays.asList(6, 2), solution1.getLonelyNodes(TreeUtils.constructBinaryTree(Arrays.asList(7, 1, 4, 6, null, 5, 3, null, null, null, null, null, 2))));
    }

}
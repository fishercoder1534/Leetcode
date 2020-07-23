package com.fishercoder;

import com.fishercoder.common.utils.TreeUtils;
import com.fishercoder.solutions._1469;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.Arrays;

import static junit.framework.TestCase.assertEquals;

public class _1469Test {
    private static _1469.Solution1 solution1;

    @BeforeClass
    public static void setup() {
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
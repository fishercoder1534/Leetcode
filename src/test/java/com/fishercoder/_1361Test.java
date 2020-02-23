package com.fishercoder;

import com.fishercoder.solutions._1361;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _1361Test {
    private static _1361.Solution1 solution1;

    @BeforeClass
    public static void setup() {
        solution1 = new _1361.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(true, solution1.validateBinaryTreeNodes(4, new int[]{1, -1, 3, -1}, new int[]{2, -1, -1, -1}));
    }

    @Test
    public void test2() {
        assertEquals(false, solution1.validateBinaryTreeNodes(4, new int[]{1, -1, 3, -1}, new int[]{2, 3, -1, -1}));
    }

    @Test
    public void test3() {
        assertEquals(false, solution1.validateBinaryTreeNodes(2, new int[]{1, 0}, new int[]{-1, -1}));
    }

    @Test
    public void test4() {
        assertEquals(false, solution1.validateBinaryTreeNodes(6, new int[]{1, -1, -1, 4, -1, -1}, new int[]{2, -1, -1, 5, -1, -1}));
    }

}
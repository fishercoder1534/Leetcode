package com.fishercoder;

import com.fishercoder.common.utils.LinkedListUtils;
import com.fishercoder.solutions._141;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _141Test {
    private static _141.Solution1 solution1;
    private static _141.Solution2 solution2;

    @BeforeClass
    public static void setup() {
        solution1 = new _141.Solution1();
        solution2 = new _141.Solution2();
    }

    @Test
    public void test1() {
        assertEquals(false, solution1.hasCycle(LinkedListUtils.contructLinkedList(new int[]{1, 2, 3, 4})));
    }

    @Test
    public void test2() {
        assertEquals(false, solution2.hasCycle(LinkedListUtils.contructLinkedList(new int[]{1, 2, 3, 4})));
    }
}

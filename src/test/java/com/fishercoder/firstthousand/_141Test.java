package com.fishercoder.firstthousand;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.fishercoder.common.utils.LinkedListUtils;
import com.fishercoder.solutions.firstthousand._141;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _141Test {
    private _141.Solution1 solution1;
    private _141.Solution2 solution2;

    @BeforeEach
    public void setup() {
        solution1 = new _141.Solution1();
        solution2 = new _141.Solution2();
    }

    @Test
    public void test1() {
        assertEquals(
                false,
                solution1.hasCycle(LinkedListUtils.contructLinkedList(new int[] {1, 2, 3, 4})));
    }

    @Test
    public void test2() {
        assertEquals(
                false,
                solution2.hasCycle(LinkedListUtils.contructLinkedList(new int[] {1, 2, 3, 4})));
    }
}

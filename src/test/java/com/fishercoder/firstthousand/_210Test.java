package com.fishercoder.firstthousand;

import com.fishercoder.solutions.firstthousand._210;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class _210Test {
    private static _210.Solution1 solution1;
    private static _210.Solution2 solution2;

    @BeforeEach
    public void setup() {
        solution1 = new _210.Solution1();
        solution2 = new _210.Solution2();
    }

    @Test
    public void test1() {
        assertArrayEquals(new int[]{0, 1}, solution1.findOrder(2, new int[][]{
                {1, 0}
        }));
        assertArrayEquals(new int[]{0, 1}, solution2.findOrder(2, new int[][]{
                {1, 0}
        }));
    }

}
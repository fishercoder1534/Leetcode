package com.fishercoder.secondthousand;

import com.fishercoder.solutions.secondthousand._1882;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class _1882Test {
    private _1882.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _1882.Solution1();
    }

    @Test
    public void test1() {
        assertArrayEquals(new int[]{2, 2, 0, 2, 1, 2}, solution1.assignTasks(new int[]{3, 3, 2}, new int[]{1, 2, 3, 2, 1, 2}));
    }

}

package com.fishercoder.firstthousand;

import com.fishercoder.solutions.firstthousand._923;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _923Test {
    private _923.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _923.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(20, solution1.threeSumMulti(new int[]{1, 1, 2, 2, 3, 3, 4, 4, 5, 5}, 8));
    }
}

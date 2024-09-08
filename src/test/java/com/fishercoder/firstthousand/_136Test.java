package com.fishercoder.firstthousand;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.fishercoder.solutions.firstthousand._136;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _136Test {
    private _136.Solution1 solution1;
    private _136.Solution2 solution2;

    @BeforeEach
    public void setup() {
        solution1 = new _136.Solution1();
        solution2 = new _136.Solution2();
    }

    @Test
    public void test1() {
        assertEquals(1, (solution1.singleNumber(new int[] {2, 2, 1})));
        assertEquals(1, (solution2.singleNumber(new int[] {2, 2, 1})));
    }
}

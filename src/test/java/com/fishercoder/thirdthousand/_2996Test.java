package com.fishercoder.thirdthousand;

import com.fishercoder.solutions.thirdthousand._2996;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _2996Test {
    private _2996.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _2996.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(6, solution1.missingInteger(new int[]{1, 2, 3, 2, 5}));
    }

    @Test
    public void test2() {
        assertEquals(15, solution1.missingInteger(new int[]{3, 4, 5, 1, 12, 14, 13}));
    }

    @Test
    public void test3() {
        assertEquals(38, solution1.missingInteger(new int[]{37, 1, 2, 9, 5, 8, 5, 2, 9, 4}));
    }

    @Test
    public void test4() {
        assertEquals(95, solution1.missingInteger(new int[]{47, 48, 2, 6, 9, 5, 10, 5, 6, 7, 6, 9, 8}));
    }

}

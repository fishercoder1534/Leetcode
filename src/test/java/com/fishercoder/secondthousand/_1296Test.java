package com.fishercoder.secondthousand;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.fishercoder.solutions.secondthousand._1296;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _1296Test {
    private _1296.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _1296.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(true, solution1.isPossibleDivide(new int[] {1, 2, 3, 3, 4, 4, 5, 6}, 4));
    }

    @Test
    public void test2() {
        assertEquals(
                true,
                solution1.isPossibleDivide(new int[] {3, 2, 1, 2, 3, 4, 3, 4, 5, 9, 10, 11}, 3));
    }

    @Test
    public void test3() {
        assertEquals(true, solution1.isPossibleDivide(new int[] {3, 3, 2, 2, 1, 1}, 3));
    }

    @Test
    public void test4() {
        assertEquals(false, solution1.isPossibleDivide(new int[] {1, 2, 3, 4}, 3));
    }
}

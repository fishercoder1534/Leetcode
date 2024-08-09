package com.fishercoder.secondthousand;

import com.fishercoder.solutions.secondthousand._1700;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _1700Test {
    private _1700.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _1700.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(0, solution1.countStudents(new int[]{1, 1, 0, 0}, new int[]{0, 1, 0, 1}));
    }

    @Test
    public void test2() {
        assertEquals(3, solution1.countStudents(new int[]{1, 1, 1, 0, 0, 1}, new int[]{1, 0, 0, 0, 1, 1}));
    }

}
package com.fishercoder.firstthousand;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.fishercoder.solutions.firstthousand._630;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _630Test {
    private _630.Solution1 solution1;
    private static int[][] courses;

    @BeforeEach
    public void setup() {
        solution1 = new _630.Solution1();
    }

    @Test
    public void test1() {
        courses =
                new int[][] {
                    {100, 200},
                    {200, 1300},
                    {1000, 1250},
                    {2000, 3200},
                    {300, 1200}
                };
        assertEquals(4, solution1.scheduleCourse(courses));
    }
}

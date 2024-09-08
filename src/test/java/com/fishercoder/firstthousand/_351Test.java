package com.fishercoder.firstthousand;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.fishercoder.solutions.firstthousand._351;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _351Test {
    private _351.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _351.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(9, solution1.numberOfPatterns(1, 1));
    }

    @Test
    public void test2() {
        assertEquals(65, solution1.numberOfPatterns(1, 2));
    }
}

package com.fishercoder.thirdthousand;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import com.fishercoder.solutions.thirdthousand._2423;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _2423Test {
    private _2423.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _2423.Solution1();
    }

    @Test
    public void test1() {
        assertTrue(solution1.equalFrequency("abcc"));
    }

    @Test
    public void test2() {
        assertTrue(solution1.equalFrequency("abc"));
    }

    @Test
    public void test3() {
        assertFalse(solution1.equalFrequency("ddaccb"));
    }

    @Test
    public void test4() {
        assertTrue(solution1.equalFrequency("abbcc"));
    }

    @Test
    public void test5() {
        assertFalse(solution1.equalFrequency("aazz"));
    }

    @Test
    public void test6() {
        assertTrue(solution1.equalFrequency("ab"));
    }
}

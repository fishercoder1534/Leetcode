package com.fishercoder.secondthousand;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.fishercoder.solutions.secondthousand._1641;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _1641Test {
    private _1641.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _1641.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(5, solution1.countVowelStrings(1));
    }

    @Test
    public void test2() {
        assertEquals(15, solution1.countVowelStrings(2));
    }

    @Test
    public void test3() {
        assertEquals(35, solution1.countVowelStrings(3));
    }

    @Test
    public void test4() {
        assertEquals(70, solution1.countVowelStrings(4));
    }

    @Test
    public void test5() {
        assertEquals(66045, solution1.countVowelStrings(33));
    }
}

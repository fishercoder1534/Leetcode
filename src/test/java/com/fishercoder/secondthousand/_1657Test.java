package com.fishercoder.secondthousand;

import com.fishercoder.solutions.secondthousand._1657;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _1657Test {
    private _1657.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _1657.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(true, solution1.closeStrings("abc", "bca"));
    }

    @Test
    public void test2() {
        assertEquals(false, solution1.closeStrings("a", "aa"));
    }

    @Test
    public void test3() {
        assertEquals(true, solution1.closeStrings("cabbba", "abbccc"));
    }

    @Test
    public void test4() {
        assertEquals(false, solution1.closeStrings("cabbba", "aabbss"));
    }

    @Test
    public void test5() {
        assertEquals(false, solution1.closeStrings("abbbzcf", "babzzcz"));
    }
}
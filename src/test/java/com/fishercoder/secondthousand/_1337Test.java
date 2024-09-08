package com.fishercoder.secondthousand;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.fishercoder.solutions.secondthousand._1337;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _1337Test {
    private _1337.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _1337.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(1, solution1.removePalindromeSub("ababa"));
    }

    @Test
    public void test2() {
        assertEquals(2, solution1.removePalindromeSub("abb"));
    }

    @Test
    public void test3() {
        assertEquals(2, solution1.removePalindromeSub("baabb"));
    }

    @Test
    public void test4() {
        assertEquals(0, solution1.removePalindromeSub(""));
    }
}

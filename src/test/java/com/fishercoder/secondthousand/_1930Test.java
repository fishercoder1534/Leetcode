package com.fishercoder.secondthousand;

import com.fishercoder.solutions.secondthousand._1930;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _1930Test {
    private _1930.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _1930.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(3, solution1.countPalindromicSubsequence("aabca"));
    }

    @Test
    public void test2() {
        assertEquals(0, solution1.countPalindromicSubsequence("adc"));
    }

    @Test
    public void test3() {
        assertEquals(4, solution1.countPalindromicSubsequence("bbcbaba"));
    }

    @Test
    public void test4() {
        assertEquals(4, solution1.countPalindromicSubsequence("ckafnafqo"));
    }

    @Test
    public void test5() {
        assertEquals(4, solution1.countPalindromicSubsequence("afnaf"));
    }

    @Test
    public void test6() {
        assertEquals(161, solution1.countPalindromicSubsequence("tlpjzdmtwderpkpmgoyrcxttiheassztncqvnfjeyxxp"));
    }

}

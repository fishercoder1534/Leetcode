package com.fishercoder.secondthousand;

import com.fishercoder.solutions.secondthousand._1371;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _1371Test {
    private _1371.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _1371.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(13, solution1.findTheLongestSubstring("eleetminicoworoep"));
    }

    @Test
    public void test2() {
        assertEquals(5, solution1.findTheLongestSubstring("leetcodeisgreat"));
    }

    @Test
    public void test3() {
        assertEquals(6, solution1.findTheLongestSubstring("bcbcbc"));
    }

    @Test
    public void test4() {
        assertEquals(1, solution1.findTheLongestSubstring("id"));
    }

}
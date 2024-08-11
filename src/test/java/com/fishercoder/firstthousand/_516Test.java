package com.fishercoder.firstthousand;

import com.fishercoder.solutions.firstthousand._516;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _516Test {
    private _516.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _516.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(4, solution1.longestPalindromeSubseq("bbbab"));
    }

}

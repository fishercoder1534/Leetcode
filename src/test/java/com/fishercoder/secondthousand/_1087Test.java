package com.fishercoder.secondthousand;

import com.fishercoder.solutions.secondthousand._1087;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class _1087Test {
    private _1087.Solution1 solution1;
    private _1087.Solution2 solution2;

    @BeforeEach
    public void setup() {
        solution1 = new _1087.Solution1();
        solution2 = new _1087.Solution2();
    }

    @Test
    public void test1() {
        assertArrayEquals(new String[]{"ade", "adf", "bde", "bdf", "cde", "cdf"}, solution1.expand("{a,b,c}d{e,f}"));
        assertArrayEquals(new String[]{"ade", "adf", "bde", "bdf", "cde", "cdf"}, solution2.expand("{a,b,c}d{e,f}"));
    }

    @Test
    public void test2() {
        assertArrayEquals(new String[]{"abcd"}, solution1.expand("abcd"));
        assertArrayEquals(new String[]{"abcd"}, solution2.expand("abcd"));
    }

    @Test
    public void test3() {
        assertArrayEquals(new String[]{"acdf", "acef", "bcdf", "bcef"}, solution1.expand("{a,b}c{d,e}f"));
        assertArrayEquals(new String[]{"acdf", "acef", "bcdf", "bcef"}, solution2.expand("{a,b}c{d,e}f"));
    }

}
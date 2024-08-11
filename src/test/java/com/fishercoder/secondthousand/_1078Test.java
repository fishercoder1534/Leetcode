package com.fishercoder.secondthousand;

import com.fishercoder.solutions.secondthousand._1078;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class _1078Test {
    private _1078.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _1078.Solution1();
    }

    @Test
    public void test1() {
        assertArrayEquals(new String[]{"girl", "student"}, solution1.findOcurrences("alice is a good girl she is a good student", "a", "good"));
    }

    @Test
    public void test2() {
        assertArrayEquals(new String[]{"we", "rock"}, solution1.findOcurrences("we will we will rock you", "we", "will"));
    }

}
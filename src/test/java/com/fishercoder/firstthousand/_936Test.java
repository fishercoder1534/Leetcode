package com.fishercoder.firstthousand;

import com.fishercoder.solutions.firstthousand._936;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class _936Test {
    private _936.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _936.Solution1();
    }

    @Test
    public void test1() {
        assertArrayEquals(new int[]{0, 2}, solution1.movesToStamp("abc", "ababc"));
    }

    @Test
    public void test2() {
        assertArrayEquals(new int[]{}, solution1.movesToStamp("aye", "eyeye"));
    }
}

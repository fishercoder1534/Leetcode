package com.fishercoder.fourththousand;

import com.fishercoder.solutions.fourththousand._3684;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class _3684Test {
    private _3684.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _3684.Solution1();
    }

    @Test
    public void test1() {
        assertArrayEquals(
                new int[]{100, 93, 90},
                solution1.maxKDistinct(new int[]{84, 93, 100, 77, 90}, 3));
    }

    @Test
    public void test2() {
        assertArrayEquals(
                new int[]{100, 93, 84},
                solution1.maxKDistinct(new int[]{84, 93, 100, 77, 93}, 3));
    }

}

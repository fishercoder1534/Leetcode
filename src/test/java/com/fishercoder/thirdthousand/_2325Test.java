package com.fishercoder.thirdthousand;

import com.fishercoder.solutions.thirdthousand._2325;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _2325Test {
    private _2325.Solution1 solution1;
    private _2325.Solution2 solution2;
    private String key;
    private String message;

    @BeforeEach
    public void setup() {
        solution1 = new _2325.Solution1();
        solution2 = new _2325.Solution2();
    }

    @Test
    public void test1() {
        key = "the quick brown fox jumps over the lazy dog";
        message = "vkbs bs t suepuv";
        String actual = solution1.decodeMessage(key, message);
        String expected = "this is a secret";
        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void test2() {
        key = "the quick brown fox jumps over the lazy dog";
        message = "vkbs bs t suepuv";
        String actual = solution2.decodeMessage(key, message);
        String expected = "this is a secret";
        Assertions.assertEquals(actual, expected);
    }
}

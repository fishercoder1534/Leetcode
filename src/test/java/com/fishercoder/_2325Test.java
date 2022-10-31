package com.fishercoder;

import com.fishercoder.solutions._2325;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class _2325Test {
    private static _2325.Solution1 solution1;
    private String key;
    private String message;

    @BeforeClass
    public static void setup() {
        solution1 = new _2325.Solution1();
    }

    @Test
    public void test1() {
        key = "the quick brown fox jumps over the lazy dog";
        message = "vkbs bs t suepuv";
        String actual = solution1.decodeMessage(key, message);
        String expected = "this is a secret";
        Assert.assertEquals(actual, expected);
    }
}

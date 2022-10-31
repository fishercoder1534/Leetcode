package com.fishercoder;

import com.fishercoder.solutions._848;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _848Test {
    private static _848.Solution1 solution1;

    @BeforeClass
    public static void setup() {
        solution1 = new _848.Solution1();
    }

    @Test
    public void test1() {
        assertEquals("rpl", solution1.shiftingLetters("abc", new int[]{3, 5, 9}));
    }

    @Test
    public void test2() {
        assertEquals("gfd", solution1.shiftingLetters("aaa", new int[]{1, 2, 3}));
    }

    @Test
    public void test3() {
        assertEquals("rul", solution1.shiftingLetters("ruu", new int[]{26, 9, 17}));
    }

    @Test
    public void test4() {
        assertEquals("wqqwlcjnkphhsyvrkdod", solution1.shiftingLetters("mkgfzkkuxownxvfvxasy", new int[]{505870226, 437526072, 266740649, 224336793, 532917782, 311122363, 567754492, 595798950, 81520022, 684110326, 137742843, 275267355, 856903962, 148291585, 919054234, 467541837, 622939912, 116899933, 983296461, 536563513}));
    }

}
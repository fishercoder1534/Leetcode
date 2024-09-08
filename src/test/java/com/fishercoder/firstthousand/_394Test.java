package com.fishercoder.firstthousand;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.fishercoder.solutions.firstthousand._394;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/** Created by varunu28 on 1/08/19. */
public class _394Test {
    private _394.Solution1 test;

    @BeforeEach
    public void setUp() {
        test = new _394.Solution1();
    }

    @Test
    public void test1() {
        assertEquals("aaabcbc", test.decodeString("3[a]2[bc]"));
    }

    @Test
    public void test2() {
        assertEquals("accaccacc", test.decodeString("3[a2[c]]"));
    }

    @Test
    public void test3() {
        assertEquals("abcabccdcdcdef", test.decodeString("2[abc]3[cd]ef"));
    }
}

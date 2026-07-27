package com.fishercoder.firstthousand;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.fishercoder.solutions.firstthousand._394;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _394Test {
    private _394.Solution1 solution1;
    private _394.Solution2 solution2;

    @BeforeEach
    public void setUp() {
        solution1 = new _394.Solution1();
        solution2 = new _394.Solution2();
    }

    @Test
    public void test1() {
        assertEquals("aaabcbc", solution1.decodeString("3[a]2[bc]"));
        assertEquals("aaabcbc", solution2.decodeString("3[a]2[bc]"));
    }

    @Test
    public void test2() {
        assertEquals("accaccacc", solution1.decodeString("3[a2[c]]"));
    }

    @Test
    public void test3() {
        assertEquals("abcabccdcdcdef", solution1.decodeString("2[abc]3[cd]ef"));
    }

    @Test
    public void test4() {
        assertEquals(
                "leetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcode",
                solution1.decodeString("100[leetcode]"));
    }
}

package com.fishercoder.secondthousand;

import com.fishercoder.solutions.secondthousand._1062;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _1062Test {
    private static _1062.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _1062.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(0, (solution1.longestRepeatingSubstring("abcd")));
    }

    @Test
    public void test2() {
        assertEquals(2, (solution1.longestRepeatingSubstring("abbaba")));
    }

    @Test
    public void test3() {
        assertEquals(3, (solution1.longestRepeatingSubstring("aabcaabdaab")));
    }

    @Test
    public void test4() {
        assertEquals(4, (solution1.longestRepeatingSubstring("aaaaa")));
    }

    @Test
    public void test5() {
        assertEquals(10, (solution1.longestRepeatingSubstring("aaabaabbbaaabaabbaabbbabbbaaaabbaaaaaabbbaabbbbbbbbbaaaabbabbaba")));
    }
}

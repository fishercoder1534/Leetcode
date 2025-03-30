package com.fishercoder.fourththousand;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.fishercoder.solutions.fourththousand._3324;
import java.util.Arrays;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _3324Test {
    private _3324.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _3324.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(
                Arrays.asList("a", "aa", "ab", "aba", "abb", "abc"),
                solution1.stringSequence("abc"));
    }
}

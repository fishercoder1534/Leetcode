package com.fishercoder.firstthousand;

import com.fishercoder.solutions.firstthousand._291;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _291Test {
    private _291.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _291.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(true, solution1.wordPatternMatch("abab", "redblueredblue"));
    }
}

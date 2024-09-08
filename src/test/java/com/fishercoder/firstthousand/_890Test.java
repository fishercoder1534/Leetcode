package com.fishercoder.firstthousand;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.fishercoder.solutions.firstthousand._890;
import java.util.Arrays;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _890Test {
    private _890.Solution1 solution1;

    @BeforeEach
    public void setUp() {
        solution1 = new _890.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(
                Arrays.asList("mee", "aqq"),
                solution1.findAndReplacePattern(
                        new String[] {"abc", "deq", "mee", "aqq", "dkd", "ccc"}, "abb"));
    }
}

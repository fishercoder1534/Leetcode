package com.fishercoder.thirdthousand;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.fishercoder.solutions.thirdthousand._2900;
import java.util.Arrays;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _2900Test {
    private _2900.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _2900.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(
                Arrays.asList("s", "l", "r", "ypp", "ev", "fv", "qzk", "xlr", "w", "v"),
                solution1.getLongestSubsequence(
                        new String[] {
                            "s", "l", "djl", "euy", "r", "lur", "u", "ypp", "ev", "fv", "we", "qzk",
                            "q", "xlr", "w", "wc", "a", "sd", "o", "x", "v"
                        },
                        new int[] {0, 1, 1, 1, 0, 0, 0, 1, 0, 1, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 1}));
    }
}

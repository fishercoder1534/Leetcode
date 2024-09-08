package com.fishercoder.thirdthousand;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.fishercoder.solutions.thirdthousand._2273;
import java.util.Arrays;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _2273Test {
    private _2273.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _2273.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(
                Arrays.asList("abba", "cd"),
                solution1.removeAnagrams(new String[] {"abba", "baba", "bbaa", "cd", "cd"}));
    }
}

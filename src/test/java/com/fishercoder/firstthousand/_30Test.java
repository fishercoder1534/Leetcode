package com.fishercoder.firstthousand;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.fishercoder.solutions.firstthousand._30;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class _30Test {
    private _30.Solution1 solution1;
    private static String[] words;
    private static List<Integer> expected;

    @BeforeEach
    public void setup() {
        solution1 = new _30.Solution1();
    }

    @Test
    @Disabled
    public void test1() {
        words = new String[] {"foo", "bar"};
        expected = Arrays.asList(0, 9);
        assertEquals(expected, solution1.findSubstring("barfoothefoobarman", words));
    }
}

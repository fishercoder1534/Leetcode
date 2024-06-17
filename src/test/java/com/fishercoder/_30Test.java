package com.fishercoder;

import com.fishercoder.solutions.first_thousand._30;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _30Test {
    private static _30.Solution1 solution1;
    private static String[] words;
    private static List<Integer> expected;

    @BeforeEach
    public void setup() {
        solution1 = new _30.Solution1();
    }

    @Test
    @Disabled
    public void test1() {
        words = new String[]{"foo", "bar"};
        expected = Arrays.asList(0, 9);
        assertEquals(expected, solution1.findSubstring("barfoothefoobarman", words));
    }
}

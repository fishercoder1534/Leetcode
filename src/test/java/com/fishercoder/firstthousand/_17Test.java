package com.fishercoder.firstthousand;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.fishercoder.solutions.firstthousand._17;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _17Test {
    private _17.Solution1 solution1;
    private _17.Solution2 solution2;
    private _17.Solution3 solution3;
    private static String digits;
    private static List<String> expected;

    @BeforeEach
    public void setup() {
        solution1 = new _17.Solution1();
        solution2 = new _17.Solution2();
        solution3 = new _17.Solution3();
    }

    @Test
    public void test1() {
        digits = "2";
        expected = new ArrayList<>(Arrays.asList("a", "b", "c"));
        assertEquals(expected, solution1.letterCombinations(digits));
        assertEquals(expected, solution2.letterCombinations(digits));
        assertEquals(expected, solution3.letterCombinations(digits));
    }

    @Test
    public void test2() {
        digits = "23";
        expected =
                new ArrayList<>(
                        Arrays.asList("ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"));
        Collections.sort(expected);
        List<String> actual = solution1.letterCombinations(digits);
        Collections.sort(actual);
        assertEquals(expected, actual);
        actual = solution2.letterCombinations(digits);
        assertEquals(expected, actual);
        actual = solution3.letterCombinations(digits);
        assertEquals(expected, actual);
    }
}

package com.fishercoder;

import com.fishercoder.solutions._17;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class _17Test {
    private static _17.Solution1 solution1;
    private static _17.Solution2 solution2;
    private static String digits;
    private static List<String> expected;

    @BeforeClass
    public static void setup() {
        solution1 = new _17.Solution1();
        solution2 = new _17.Solution2();
    }

    @Test
    public void test1() {
        digits = "2";
        expected = new ArrayList<>(Arrays.asList("a", "b", "c"));
        assertThat(expected).hasSameElementsAs(solution1.letterCombinations(digits));
        assertThat(expected).hasSameElementsAs(solution2.letterCombinations(digits));
    }

    @Test
    public void test2() {
        digits = "23";
        expected = new ArrayList<>(Arrays.asList("ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"));
        assertThat(expected).hasSameElementsAs(solution1.letterCombinations(digits));
        assertThat(expected).hasSameElementsAs(solution2.letterCombinations(digits));
    }
}

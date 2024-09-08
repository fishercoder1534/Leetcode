package com.fishercoder.firstthousand;

import static org.junit.jupiter.api.Assertions.assertTrue;

import com.fishercoder.solutions.firstthousand._249;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _249Test {
    private _249.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _249.Solution1();
    }

    @Test
    public void test1() {
        List<List<String>> expected =
                Arrays.asList(
                        Arrays.asList("acef"),
                        Arrays.asList("a", "z"),
                        Arrays.asList("abc", "bcd", "xyz"),
                        Arrays.asList("az", "ba"));
        List<List<String>> actual =
                solution1.groupStrings(
                        new String[] {"abc", "bcd", "acef", "xyz", "az", "ba", "a", "z"});
        assertTrue(expected.containsAll(actual));
        assertTrue(actual.containsAll(expected));
    }
}

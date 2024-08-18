package com.fishercoder.secondthousand;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.fishercoder.solutions.secondthousand._1408;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _1408Test {
    private _1408.Solution1 solution1;
    private static String[] words;
    private static List<String> expected;
    private static List<String> actual;

    @BeforeEach
    public void setup() {
        solution1 = new _1408.Solution1();
    }

    @Test
    public void test1() {
        words = new String[] {"mass", "as", "hero", "superhero"};
        expected = Arrays.asList("as", "hero");
        actual = solution1.stringMatching(words);
        assertEquals(expected.containsAll(actual), actual.containsAll(expected));
    }
}

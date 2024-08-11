package com.fishercoder.secondthousand;

import com.fishercoder.solutions.secondthousand._1258;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _1258Test {

    private _1258.Solution1 solution1;
    private static List<List<String>> synonyms;

    @BeforeEach
    public void setup() {
        solution1 = new _1258.Solution1();
    }

    @Test
    public void test1() {
        synonyms = Arrays.asList(Arrays.asList("happy", "joy"), Arrays.asList("sad", "sorrow"), Arrays.asList("joy", "cheerful"));
        List<String> expected = Arrays.asList("I am cheerful today but was sad yesterday", "I am cheerful today but was sorrow yesterday", "I am happy today but was sad yesterday", "I am happy today but was sorrow yesterday",
                "I am joy today but was sad yesterday", "I am joy today but was sorrow yesterday");
        assertEquals(expected, solution1.generateSentences(synonyms, "I am happy today but was sad yesterday"));
    }

}

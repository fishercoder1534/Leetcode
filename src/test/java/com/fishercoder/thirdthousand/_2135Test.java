package com.fishercoder.thirdthousand;

import com.fishercoder.solutions.thirdthousand._2135;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _2135Test {
    private static _2135.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _2135.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(2, solution1.wordCount(new String[]{"ant", "act", "tack"}, new String[]{"tack", "act", "acti"}));
    }

    @Test
    public void test2() {
        assertEquals(1, solution1.wordCount(new String[]{"mox", "bj", "rsy", "jqsh"}, new String[]{"trk", "vjb", "jkr"}));
    }

    @Test
    public void test3() {
        assertEquals(1, solution1.wordCount(new String[]{"uh"}, new String[]{"u", "hur", "k", "b", "u", "yse", "giqoy", "lni", "olqb", "nemc"}));
    }
}

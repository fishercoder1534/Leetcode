package com.fishercoder.firstthousand;

import com.fishercoder.solutions.firstthousand._809;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _809Test {
    private _809.Solution1 solution1;
    private String[] words;

    @BeforeEach
    public void setup() {
        solution1 = new _809.Solution1();
    }

    @Test
    public void test1() {
        words = new String[]{"hello", "hi", "helo"};
        assertEquals(1, solution1.expressiveWords("heeellooo", words));
    }
}

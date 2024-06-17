package com.fishercoder.firstthousand;

import com.fishercoder.solutions.firstthousand._58;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _58Test {
    private static _58.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _58.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(5, solution1.lengthOfLastWord("Hello World"));
    }
}

package com.fishercoder.firstthousand;

import com.fishercoder.solutions.firstthousand._844;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _844Test {
    private static _844.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _844.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(true, solution1.backspaceCompare("ab#c", "ad#c"));
    }

    @Test
    public void test2() {
        assertEquals(true, solution1.backspaceCompare("ab##", "c#d#"));
    }

    @Test
    public void test3() {
        assertEquals(true, solution1.backspaceCompare("a##c", "#a#c"));
    }

    @Test
    public void test4() {
        assertEquals(false, solution1.backspaceCompare("a#c", "b"));
    }

}

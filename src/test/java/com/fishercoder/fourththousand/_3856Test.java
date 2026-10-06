package com.fishercoder.fourththousand;

import com.fishercoder.solutions.fourththousand._3856;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _3856Test {
    private _3856.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _3856.Solution1();
    }

    @Test
    public void test1() {
        assertEquals("id", solution1.trimTrailingVowels("idea"));
    }

    @Test
    public void test2() {
        assertEquals("", solution1.trimTrailingVowels("aeiou"));
    }
}

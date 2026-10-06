package com.fishercoder.fourththousand;

import com.fishercoder.solutions.fourththousand._3823;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _3823Test {
    private _3823.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _3823.Solution1();
    }

    @Test
    public void test1() {
        assertEquals("(fad@cb#e)", solution1.reverseByType(")ebc#da@f("));
    }
}

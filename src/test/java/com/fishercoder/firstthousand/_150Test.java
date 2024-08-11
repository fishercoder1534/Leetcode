package com.fishercoder.firstthousand;

import com.fishercoder.solutions.firstthousand._150;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _150Test {
    private _150.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _150.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(9, solution1.evalRPN(new String[]{"2", "1", "+", "3", "*"}));
    }

}

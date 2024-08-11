package com.fishercoder.firstthousand;

import com.fishercoder.solutions.firstthousand._592;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Created by fishercoder on 5/23/17.
 */
public class _592Test {
    private _592.Solution1 test;
    private static String expression;

    @BeforeEach
    public void setup() {
        test = new _592.Solution1();
    }

    @Test
    public void test1() {
        expression = "-1/2+1/2+1/3";
        assertEquals("1/3", test.fractionAddition(expression));
    }
}

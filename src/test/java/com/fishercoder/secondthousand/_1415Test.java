package com.fishercoder.secondthousand;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.fishercoder.solutions.secondthousand._1415;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _1415Test {

    private _1415.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _1415.Solution1();
    }

    @Test
    public void test1() {
        assertEquals("cab", solution1.getHappyString(3, 9));
    }
}

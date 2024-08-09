package com.fishercoder.secondthousand;

import com.fishercoder.solutions.secondthousand._1025;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@Disabled
public class _1025Test {
    private _1025.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _1025.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(true, solution1.divisorGame(2));
    }
}

package com.fishercoder.secondthousand;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.fishercoder.solutions.secondthousand._1410;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _1410Test {
    private _1410.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _1410.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(
                "& is an HTML entity but &ambassador; is not.",
                solution1.entityParser("&amp; is an HTML entity but &ambassador; is not."));
    }
}

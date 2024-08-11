package com.fishercoder.secondthousand;

import com.fishercoder.solutions.secondthousand._1061;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _1061Test {
    private _1061.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _1061.Solution1();
    }

    @Test
    public void test1() {
        assertEquals("makkek", solution1.smallestEquivalentString("parker", "morris", "parser"));
    }

}
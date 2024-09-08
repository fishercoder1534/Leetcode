package com.fishercoder.secondthousand;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.fishercoder.solutions.secondthousand._1507;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _1507Test {
    private _1507.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _1507.Solution1();
    }

    @Test
    public void test1() {
        assertEquals("2052-10-20", solution1.reformatDate("20th Oct 2052"));
    }
}

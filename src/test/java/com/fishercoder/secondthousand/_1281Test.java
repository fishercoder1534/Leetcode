package com.fishercoder.secondthousand;

import com.fishercoder.solutions.secondthousand._1281;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _1281Test {
    private _1281.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _1281.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(15, solution1.subtractProductAndSum(234));
    }

}
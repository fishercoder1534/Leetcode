package com.fishercoder.secondthousand;

import com.fishercoder.solutions.secondthousand._1576;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _1576Test {
    private _1576.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _1576.Solution1();
    }

    @Test
    public void test1() {
        assertEquals("azs", solution1.modifyString("?zs"));
    }
}

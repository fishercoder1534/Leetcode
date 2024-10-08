package com.fishercoder.secondthousand;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.fishercoder.solutions.secondthousand._1717;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _1717Test {
    private _1717.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _1717.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(19, solution1.maximumGain("cdbcbbaaabab", 4, 5));
    }

    @Test
    public void test2() {
        assertEquals(20, solution1.maximumGain("aabbaaxybbaabb", 5, 4));
    }
}

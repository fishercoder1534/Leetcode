package com.fishercoder.firstthousand;

import com.fishercoder.solutions.firstthousand._752;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _752Test {
    private _752.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _752.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(6, solution1.openLock(new String[]{"0201", "0101", "0102", "1212", "2002"}, "0202"));
    }

}
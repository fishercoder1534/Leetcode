package com.fishercoder.firstthousand;

import com.fishercoder.solutions.secondthousand._1985;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _1985Test {
    private static _1985.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _1985.Solution1();
    }

    @Test
    public void test1() {
        assertEquals("3", solution1.kthLargestNumber(new String[]{"3", "6", "7", "10"}, 4));
    }

    @Test
    public void test2() {
        assertEquals("2", solution1.kthLargestNumber(new String[]{"2", "21", "12", "1"}, 3));
    }
}

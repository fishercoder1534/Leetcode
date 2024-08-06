package com.fishercoder.secondthousand;

import com.fishercoder.solutions.secondthousand._1985;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _1985Test {
    private static _1985.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _1985.Solution1();
    }

    @org.junit.jupiter.api.Test
    public void test1() {
        Assertions.assertEquals("3", solution1.kthLargestNumber(new String[]{"3", "6", "7", "10"}, 4));
    }

    @Test
    public void test2() {
        Assertions.assertEquals("2", solution1.kthLargestNumber(new String[]{"2", "21", "12", "1"}, 3));
    }
}
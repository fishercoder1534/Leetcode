package com.fishercoder.firstthousand;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.fishercoder.solutions.firstthousand._93;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _93Test {
    private _93.Solution1 solution1;
    private static List<String> expected;
    private static String s;

    @BeforeEach
    public void setUp() {
        solution1 = new _93.Solution1();
    }

    @BeforeEach
    public void setupForEachTest() {
        expected = new ArrayList<>();
    }

    @Test
    public void test1() {
        s = "25525511135";
        expected.add("255.255.11.135");
        expected.add("255.255.111.35");
        assertEquals(expected, solution1.restoreIpAddresses(s));
    }
}

package com.fishercoder.secondthousand;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.fishercoder.solutions.secondthousand._1108;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _1108Test {
    private _1108.Solution1 solution1;
    private _1108.Solution2 solution2;

    @BeforeEach
    public void setup() {
        solution1 = new _1108.Solution1();
        solution2 = new _1108.Solution2();
    }

    @Test
    public void test1() {
        assertEquals("1[.]1[.]1[.]1", solution1.defangIPaddr("1.1.1.1"));
        assertEquals("1[.]1[.]1[.]1", solution2.defangIPaddr("1.1.1.1"));
    }

    @Test
    public void test2() {
        assertEquals("255[.]100[.]50[.]0", solution1.defangIPaddr("255.100.50.0"));
        assertEquals("255[.]100[.]50[.]0", solution2.defangIPaddr("255.100.50.0"));
    }
}

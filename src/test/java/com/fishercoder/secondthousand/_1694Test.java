package com.fishercoder.secondthousand;

import com.fishercoder.solutions.secondthousand._1694;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _1694Test {
    private _1694.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _1694.Solution1();
    }

    @Test
    public void test1() {
        assertEquals("123-456", solution1.reformatNumber("1-23-45 6"));
    }

    @Test
    public void test2() {
        assertEquals("123-45-67", solution1.reformatNumber("123 4-567"));
    }

    @Test
    public void test3() {
        assertEquals("123-456-78", solution1.reformatNumber("123 4-5678"));
    }

    @Test
    public void test4() {
        assertEquals("12", solution1.reformatNumber("12"));
    }

    @Test
    public void test5() {
        assertEquals("175-229-353-94-75", solution1.reformatNumber("--17-5 229 35-39475 "));
    }

}
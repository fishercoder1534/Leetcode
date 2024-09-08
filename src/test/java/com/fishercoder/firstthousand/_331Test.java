package com.fishercoder.firstthousand;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.fishercoder.solutions.firstthousand._331;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _331Test {
    private _331.Solution1 solution1;

    @BeforeEach
    public void setUp() {
        solution1 = new _331.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(true, solution1.isValidSerialization("9,3,4,#,#,1,#,#,2,#,6,#,#"));
    }

    @Test
    public void test2() {
        assertEquals(false, solution1.isValidSerialization("1,#"));
    }

    @Test
    public void test3() {
        assertEquals(false, solution1.isValidSerialization("9,#,#,1"));
    }

    @Test
    public void test4() {
        assertEquals(false, solution1.isValidSerialization("1"));
    }

    @Test
    public void test5() {
        assertEquals(false, solution1.isValidSerialization("#,7,6,9,#,#,#"));
    }
}

package com.fishercoder.firstthousand;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.fishercoder.solutions.firstthousand._191;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _191Test {
    private _191.Solution1 solution1;
    private _191.Solution2 solution2;
    private _191.Solution3 solution3;
    private _191.Solution4 solution4;

    @BeforeEach
    public void setup() {
        solution1 = new _191.Solution1();
        solution2 = new _191.Solution2();
        solution3 = new _191.Solution3();
        solution4 = new _191.Solution4();
    }

    @Test
    public void test1() {
        assertEquals(1, solution1.hammingWeight(1));
        assertEquals(1, solution2.hammingWeight(1));
        assertEquals(1, solution3.hammingWeight(1));
        assertEquals(1, solution4.hammingWeight(1));
    }

    @Test
    public void test2() {
        //        System.out.println(Integer.MAX_VALUE);
        //        assertEquals(2147483648, Integer.MAX_VALUE);
    }
}

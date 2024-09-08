package com.fishercoder.firstthousand;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.fishercoder.solutions.firstthousand._974;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _974Test {

    private _974.Solution1 test;

    @BeforeEach
    public void setup() {
        test = new _974.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(7, test.subarraysDivByK(new int[] {4, 5, 0, -2, -3, 1}, 5));
    }
}

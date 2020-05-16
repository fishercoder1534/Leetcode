package com.fishercoder;

import com.fishercoder.solutions._1447;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class _1447Test {
    private static _1447.Solution1 solution1;

    @BeforeClass
    public static void setup() {
        solution1 = new _1447.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(Arrays.asList("1/2"), solution1.simplifiedFractions(2));
    }

}
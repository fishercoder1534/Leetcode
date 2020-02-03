package com.fishercoder;

import com.fishercoder.solutions._1025;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

@Ignore
public class _1025Test {
    private static _1025.Solution1 solution1;

    @Before
    public void setup() {
        solution1 = new _1025.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(true, solution1.divisorGame(2));
    }
}

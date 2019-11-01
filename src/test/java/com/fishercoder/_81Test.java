package com.fishercoder;

import com.fishercoder.solutions._81;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _81Test {
    private static _81.Solution1 solution1;

    @BeforeClass
    public static void setup() {
        solution1 = new _81.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(true, (solution1.search(new int[]{2, 5, 6, 0, 0, 1, 2}, 0)));
    }

    @Test
    public void test2() {
        assertEquals(false, (solution1.search(new int[]{2, 5, 6, 0, 0, 1, 2}, 3)));
    }

}

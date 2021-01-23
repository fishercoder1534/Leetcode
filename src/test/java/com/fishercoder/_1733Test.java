package com.fishercoder;

import com.fishercoder.solutions._1733;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _1733Test {
    private static _1733.Solution1 solution1;

    @BeforeClass
    public static void setup() {
        solution1 = new _1733.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(1, solution1.minimumTeachings(2, new int[][]{
                {1}, {2}, {1, 2}
        }, new int[][]{
                {1, 2}, {1, 3}, {2, 3}
        }));
    }

    @Test
    public void test2() {
        assertEquals(2, solution1.minimumTeachings(3, new int[][]{
                {2}, {1, 3}, {1, 2}, {3}
        }, new int[][]{
                {1, 4}, {1, 2}, {3, 4}, {2, 3}
        }));
    }

}
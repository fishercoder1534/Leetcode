package com.fishercoder;

import com.fishercoder.solutions._985;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class _985Test {
    private static _985.Solution1 test;

    @BeforeClass
    public static void setU() {
        test = new _985.Solution1();
    }

    @Test
    public void test1() {
        assertArrayEquals(
                new int[]{8, 6, 2, 4},
                test.sumEvenAfterQueries(
                        new int[]{1, 2, 3, 4},
                        new int[][]{{1, 0}, {-3, 1}, {-4, 0}, {2, 3}}
                    )
            );
    }
}

package com.fishercoder;

import com.fishercoder.solutions._1090;
import com.fishercoder.solutions._28;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class _1090Test {
    private static _1090.Solution1 solution1;

    @Before
    public void setupForEachTest() {
        solution1 = new _1090.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(9, solution1.largestValsFromLabels(new int[]{5, 4, 3, 2, 1}, new int[]{1, 1, 2, 2, 3}, 3, 1));
    }

}

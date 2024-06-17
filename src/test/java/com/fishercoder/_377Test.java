package com.fishercoder;

import com.fishercoder.solutions._1st_thousand._377;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class _377Test {
    private static _377.Solution1 solution1;
    private static _377.Solution2 solution2;
    private static _377.Solution3 solution3;
    private static _377.Solution4 solution4;
    private static int[] nums;
    private static int target;
    private static int expected;

    @BeforeClass
    public static void setup() {
        solution1 = new _377.Solution1();
        solution2 = new _377.Solution2();
        solution3 = new _377.Solution3();
    }

    @Before
    public void setUp() throws Exception {
        //always have to reset these global variables before using it again
        solution2.count = 0;
        solution4 = new _377.Solution4();
    }

    @Test
    public void test1() {
        nums = new int[]{1, 2, 3};
        target = 4;
        expected = 7;
        assertEquals(expected, solution1.combinationSum4(nums, target));
        assertEquals(expected, solution2.combinationSum4(nums, target));
        assertEquals(expected, solution3.combinationSum4(nums, target));
        assertEquals(expected, solution4.combinationSum4(nums, target));
    }

    @Test
    public void test2() {
        nums = new int[]{4, 2, 1};
        target = 32;
        expected = 39882198;
//        assertEquals(39882198, solution1.combinationSum4(nums, target));//this results in MLE, so comment out

        assertEquals(expected, solution2.combinationSum4(nums, target));

        assertEquals(expected, solution3.combinationSum4(nums, target));

        assertEquals(expected, solution4.combinationSum4(nums, target));
    }

    @Test
    public void test3() {
        nums = new int[]{9};
        target = 3;
        expected = 0;
        assertEquals(expected, solution1.combinationSum4(nums, target));
        assertEquals(expected, solution2.combinationSum4(nums, target));
        assertEquals(expected, solution3.combinationSum4(nums, target));
        assertEquals(expected, solution4.combinationSum4(nums, target));
    }

}

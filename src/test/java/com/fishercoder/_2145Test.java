package com.fishercoder;

import com.fishercoder.solutions._2145;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _2145Test {
    private static _2145.Solution1 solution1;
    private static int[] differences;
    private static int lower;
    private static int upper;
    private static int expected;

    @BeforeClass
    public static void setup() {
        solution1 = new _2145.Solution1();
    }

    @Test
    public void test1() {
        differences = new int[]{1, -3, 4};
        lower = 1;
        upper = 6;
        expected = 2;
        assertEquals(expected, solution1.numberOfArrays(differences, lower, upper));
    }

    @Test
    public void test2() {
        differences = new int[]{3, -4, 5, 1, -2};
        lower = -4;
        upper = 5;
        expected = 4;
        assertEquals(expected, solution1.numberOfArrays(differences, lower, upper));
    }

    @Test
    public void test3() {
        differences = new int[]{4, -7, 2};
        lower = 3;
        upper = 6;
        expected = 0;
        assertEquals(expected, solution1.numberOfArrays(differences, lower, upper));
    }

    @Test
    public void test4() {
        differences = new int[]{-97793, 95035, 79372, -41294, -90060, -57485, 28899, -83385, -64425};
        lower = -99340;
        upper = -1477;
        expected = 0;
        assertEquals(expected, solution1.numberOfArrays(differences, lower, upper));
    }

    @Test
    public void test5() {
        differences = new int[]{23263, -3868, -24260, -11705};
        lower = -26206;
        upper = 23564;
        expected = 9938;
        assertEquals(expected, solution1.numberOfArrays(differences, lower, upper));
    }


}

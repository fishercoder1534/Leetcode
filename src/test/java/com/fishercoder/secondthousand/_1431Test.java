package com.fishercoder.secondthousand;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.fishercoder.solutions.secondthousand._1431;
import java.util.Arrays;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _1431Test {
    private _1431.Solution1 solution1;
    private static int[] candies;

    @BeforeEach
    public void setup() {
        solution1 = new _1431.Solution1();
    }

    @Test
    public void test1() {
        candies = new int[] {2, 3, 5, 1, 3};
        assertEquals(
                Arrays.asList(true, true, true, false, true),
                solution1.kidsWithCandies(candies, 3));
    }
}

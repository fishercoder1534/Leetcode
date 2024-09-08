package com.fishercoder.secondthousand;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.fishercoder.solutions.secondthousand._1560;
import java.util.Arrays;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _1560Test {
    private _1560.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _1560.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(Arrays.asList(1, 2), solution1.mostVisited(4, new int[] {1, 3, 1, 2}));
    }

    @Test
    public void test2() {
        assertEquals(
                Arrays.asList(2), solution1.mostVisited(2, new int[] {2, 1, 2, 1, 2, 1, 2, 1, 2}));
    }

    @Test
    public void test3() {
        assertEquals(
                Arrays.asList(1, 2, 3, 4, 5, 6, 7),
                solution1.mostVisited(7, new int[] {1, 3, 5, 7}));
    }
}

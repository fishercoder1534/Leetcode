package com.fishercoder.firstthousand;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.fishercoder.solutions.firstthousand._554;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _554Test {
    private _554.Solution1 test;
    private static int expected;
    private static int actual;
    private static List<List<Integer>> wall;

    @BeforeEach
    public void setup() {
        test = new _554.Solution1();
    }

    @BeforeEach
    public void setupForEachTest() {}

    @Test
    public void test1() {
        wall = new ArrayList<>();
        wall.add(Arrays.asList(1, 2, 2, 1));
        wall.add(Arrays.asList(3, 1, 2));
        wall.add(Arrays.asList(1, 3, 2));
        wall.add(Arrays.asList(2, 4));
        wall.add(Arrays.asList(3, 1, 2));
        wall.add(Arrays.asList(1, 3, 1, 1));
        expected = 2;
        actual = test.leastBricks(wall);
        assertEquals(expected, actual);
    }
}

package com.fishercoder.firstthousand;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.fishercoder.solutions.firstthousand._830;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _830Test {
    private _830.Solution1 solution1;
    private static List<List<Integer>> expected;

    @BeforeEach
    public void setUp() {
        solution1 = new _830.Solution1();
    }

    @Test
    public void test1() {
        expected = new ArrayList<>();
        expected.add(Arrays.asList(3, 6));
        assertEquals(expected, solution1.largeGroupPositions("abbxxxxzzy"));
    }

    @Test
    public void test2() {
        expected = new ArrayList<>();
        assertEquals(expected, solution1.largeGroupPositions("abc"));
    }

    @Test
    public void test3() {
        expected = new ArrayList<>();
        expected.add(Arrays.asList(3, 5));
        expected.add(Arrays.asList(6, 9));
        expected.add(Arrays.asList(12, 14));
        assertEquals(expected, solution1.largeGroupPositions("abcdddeeeeaabbbcd"));
    }
}

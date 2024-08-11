package com.fishercoder.firstthousand;

import com.fishercoder.solutions.firstthousand._973;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class _973Test {
    private _973.Solution1 solution1;
    private _973.Solution2 solution2;

    @BeforeEach
    public void setUp() {
        solution1 = new _973.Solution1();
        solution2 = new _973.Solution2();
    }

    @Test
    public void test1() {
        assertArrayEquals(new int[][]{{-2, 2}}, solution1.kClosest(new int[][]{{1, 3}, {-2, 2}}, 1));
        assertArrayEquals(new int[][]{{-2, 2}}, solution2.kClosest(new int[][]{{1, 3}, {-2, 2}}, 1));
    }

    @Test
    public void test2() {
        assertArrayEquals(new int[][]{{3, 3}, {-2, 4}}, solution1.kClosest(new int[][]{{3, 3}, {5, -1}, {-2, 4}}, 2));
        assertArrayEquals(new int[][]{{-2, 4}, {3, 3}}, solution2.kClosest(new int[][]{{3, 3}, {5, -1}, {-2, 4}}, 2));
    }
}

package com.fishercoder.secondthousand;

import com.fishercoder.solutions.secondthousand._1583;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _1583Test {
    private _1583.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _1583.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(2, solution1.unhappyFriends(4, new int[][]{
                        {1, 2, 3},
                        {3, 2, 0},
                        {3, 1, 0},
                        {1, 2, 0}
                },
                new int[][]{
                        {0, 1},
                        {2, 3}
                }));
    }

}
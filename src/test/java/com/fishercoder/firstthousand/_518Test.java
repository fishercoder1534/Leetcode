package com.fishercoder.firstthousand;

import com.fishercoder.solutions.firstthousand._518;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _518Test {
    private _518.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _518.Solution1();
    }

    @Test
    public void test1() {
        int amount = 5;
        int[] coins = new int[] {1, 2, 5};
        int expected = 4;
        int actual = solution1.change(amount, coins);
        assertEquals(expected, actual);
    }
}

package com.fishercoder.thirdthousand;

import com.fishercoder.solutions.thirdthousand._2028;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class _2028Test {
    private _2028.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _2028.Solution1();
    }

    @Test
    public void test1() {
        assertArrayEquals(new int[]{}, solution1.missingRolls(new int[]{4, 2, 2, 5, 4, 5, 4, 5, 3, 3, 6, 1, 2, 4, 2, 1, 6, 5, 4, 2, 3, 4, 2, 3, 3, 5, 4, 1, 4, 4, 5, 3, 6, 1, 5, 2, 3, 3, 6, 1, 6, 4, 1, 3}, 2, 53));
    }

}

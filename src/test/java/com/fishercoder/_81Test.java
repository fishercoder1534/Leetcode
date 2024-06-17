package com.fishercoder;

import com.fishercoder.solutions.first_thousand._81;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _81Test {
    private static _81.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _81.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(true, (solution1.search(new int[]{2, 5, 6, 0, 0, 1, 2}, 0)));
    }

    @Test
    public void test2() {
        assertEquals(false, (solution1.search(new int[]{2, 5, 6, 0, 0, 1, 2}, 3)));
    }

}

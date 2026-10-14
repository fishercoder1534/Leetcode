package com.fishercoder.fourththousand;

import com.fishercoder.solutions.fourththousand._3492;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _3492Test {
    private _3492.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _3492.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(4, solution1.maxContainers(2, 3, 15));
    }

    @Test
    public void test2() {
        assertEquals(4, solution1.maxContainers(3, 5, 20));
    }

}

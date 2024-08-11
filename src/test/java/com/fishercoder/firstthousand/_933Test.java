package com.fishercoder.firstthousand;

import com.fishercoder.solutions.firstthousand._933;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _933Test {
    private _933.Solution1.RecentCounter solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _933.Solution1.RecentCounter();
    }

    @Test
    public void test1() {
        assertEquals(1, solution1.ping(1));
    }

}

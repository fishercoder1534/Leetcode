package com.fishercoder.firstthousand;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.fishercoder.solutions.firstthousand._621;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _621Test {
    private _621.Solution1 solution1;
    private static char[] tasks;

    @BeforeEach
    public void setup() {
        solution1 = new _621.Solution1();
    }

    @Test
    public void test1() {
        tasks = new char[] {'A', 'A', 'A', 'B', 'B', 'B'};
        assertEquals(8, solution1.leastInterval(tasks, 2));
    }
}

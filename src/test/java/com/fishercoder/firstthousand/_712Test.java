package com.fishercoder.firstthousand;

import com.fishercoder.solutions.firstthousand._712;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _712Test {
    private _712.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _712.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(231, solution1.minimumDeleteSum("sea", "eat"));
    }

    @Test
    public void test2() {
        assertEquals(403, solution1.minimumDeleteSum("delete", "leet"));
    }

}

package com.fishercoder.firstthousand;

import com.fishercoder.solutions.firstthousand._647;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _647Test {
    private _647.Solution1 solution1;
    private _647.Solution2 solution2;

    @BeforeEach
    public void setup() {
        solution1 = new _647.Solution1();
        solution2 = new _647.Solution2();
    }

    @Test
    public void test1() {
        assertEquals(3, solution1.countSubstrings("abc"));
        assertEquals(3, solution2.countSubstrings("abc"));
    }

}

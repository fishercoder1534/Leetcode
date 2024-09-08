package com.fishercoder.firstthousand;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.fishercoder.solutions.firstthousand._294;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _294Test {
    private _294.Solution1 solution1;

    @BeforeEach
    public void setUp() {
        solution1 = new _294.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(true, solution1.canWin("++++"));
    }
}

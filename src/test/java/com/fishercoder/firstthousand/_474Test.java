package com.fishercoder.firstthousand;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.fishercoder.solutions.firstthousand._474;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _474Test {
    private _474.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _474.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(
                4, solution1.findMaxForm(new String[] {"10", "0001", "111001", "1", "0"}, 5, 3));
    }
}

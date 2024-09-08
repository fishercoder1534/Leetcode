package com.fishercoder.thirdthousand;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.fishercoder.solutions.thirdthousand._2855;
import java.util.Arrays;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _2855Test {
    private _2855.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _2855.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(2, solution1.minimumRightShifts(Arrays.asList(3, 4, 5, 1, 2)));
    }
}

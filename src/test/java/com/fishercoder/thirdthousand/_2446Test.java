package com.fishercoder.thirdthousand;

import static org.junit.jupiter.api.Assertions.assertTrue;

import com.fishercoder.solutions.thirdthousand._2446;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _2446Test {
    private _2446.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _2446.Solution1();
    }

    @Test
    public void test1() {
        assertTrue(
                solution1.haveConflict(
                        new String[] {"01:15", "02:00"}, new String[] {"02:00", "03:00"}));
    }
}

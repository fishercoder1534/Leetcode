package com.fishercoder.firstthousand;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.fishercoder.solutions.firstthousand._800;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _800Test {
    private _800.Solution1 solution1;

    @BeforeEach
    public void setUp() {
        solution1 = new _800.Solution1();
    }

    @Test
    public void test1() {
        assertEquals("#11ee66", solution1.similarRGB("#09f166"));
    }
}

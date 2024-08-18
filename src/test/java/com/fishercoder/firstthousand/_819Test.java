package com.fishercoder.firstthousand;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.fishercoder.solutions.firstthousand._819;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _819Test {
    private _819.Solution1 solution1;
    private static String[] banned;

    @BeforeEach
    public void setUp() {
        solution1 = new _819.Solution1();
    }

    @Test
    public void test1() {
        banned = new String[] {"hit"};
        assertEquals(
                "ball",
                solution1.mostCommonWord(
                        "Bob hit a ball, the hit BALL flew far after it was hit.", banned));
    }
}

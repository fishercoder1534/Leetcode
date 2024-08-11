package com.fishercoder.thirdthousand;

import com.fishercoder.solutions.thirdthousand._2038;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _2038Test {
    private _2038.Solution1 solution1;
    private static String color;

    @BeforeEach
    public void setup() {
        solution1 = new _2038.Solution1();
    }

    @Test
    public void test1() {
        color = "AAABABB";
        assertEquals(true, solution1.winnerOfGame(color));
    }

}
package com.fishercoder.secondthousand;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.fishercoder.solutions.secondthousand._1138;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _1138Test {
    private _1138.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _1138.Solution1();
    }

    @Test
    public void test1() {
        assertEquals("DDR!UURRR!!DDD!", solution1.alphabetBoardPath("leet"));
    }

    @Test
    public void test2() {
        assertEquals("DDDDD!UUUUURRR!DDDDLLLD!", solution1.alphabetBoardPath("zdz"));
    }
}

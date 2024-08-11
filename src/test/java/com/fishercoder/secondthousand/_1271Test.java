package com.fishercoder.secondthousand;

import com.fishercoder.solutions.secondthousand._1271;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _1271Test {
    private _1271.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _1271.Solution1();
    }

    @Test
    public void test1() {
        assertEquals("IOI", solution1.toHexspeak("257"));
    }

    @Test
    public void test2() {
        assertEquals("ERROR", solution1.toHexspeak("3"));
    }

    @Test
    public void test3() {
        assertEquals("ERROR", solution1.toHexspeak("619879596177"));
    }

    @Test
    public void test4() {
        assertEquals("AEIDBCDIBC", solution1.toHexspeak("747823223228"));
    }

}

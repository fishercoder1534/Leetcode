package com.fishercoder.secondthousand;

import com.fishercoder.solutions.secondthousand._1455;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _1455Test {
    private _1455.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _1455.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(4, solution1.isPrefixOfWord("i love eating burger", "burg"));
    }

}
package com.fishercoder.firstthousand;

import com.fishercoder.solutions.firstthousand._433;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _433Test {
    private _433.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _433.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(-1, solution1.minMutation("AACCGGTT", "AACCGGTA", new String[]{}));
    }

    @Test
    public void test2() {
        assertEquals(-1, solution1.minMutation("AAAAAAAA", "CCCCCCCC",
                new String[]{"AAAAAAAA", "AAAAAAAC", "AAAAAACC", "AAAAACCC", "AAAACCCC", "AACACCCC", "ACCACCCC", "ACCCCCCC", "CCCCCCCA"}));
    }

    @Test
    public void test3() {
        assertEquals(-1, solution1.minMutation("AAAAAAAT", "CCCCCCCC",
                new String[]{"AAAAAAAC", "AAAAAAAA", "CCCCCCCC"}));
    }

}

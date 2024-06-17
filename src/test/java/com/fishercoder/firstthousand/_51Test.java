package com.fishercoder.firstthousand;

import com.fishercoder.solutions.firstthousand._51;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _51Test {
    private static _51.Solution1 solution1;
    private static List<List<String>> expected;
    private static List<List<String>> actual;
    private static int n;

    @BeforeEach
    public void setup() {
        solution1 = new _51.Solution1();
        expected = new ArrayList<>();
        actual = new ArrayList<>();
    }

    @Test
    public void test1() {
        n = 4;
        expected = new ArrayList<>();
        expected.add(Arrays.asList("..Q.", "Q...", "...Q", ".Q.."));
        expected.add(Arrays.asList(".Q..", "...Q", "Q...", "..Q."));
        actual = solution1.solveNQueens(n);
        assertEquals(expected, actual);
    }
}

package com.fishercoder.firstthousand;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import com.fishercoder.solutions.firstthousand._529;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _529Test {
    private _529.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _529.Solution1();
    }

    @Test
    public void test1() {
        char[][] actual =
                solution1.updateBoard(
                        new char[][] {
                            {'E', 'E', 'E', 'E', 'E'},
                            {'E', 'E', 'M', 'E', 'E'},
                            {'E', 'E', 'E', 'E', 'E'},
                            {'E', 'E', 'E', 'E', 'E'},
                        },
                        new int[] {3, 0});
        char[][] expected =
                new char[][] {
                    {'B', '1', 'E', '1', 'B'},
                    {'B', '1', 'M', '1', 'B'},
                    {'B', '1', '1', '1', 'B'},
                    {'B', 'B', 'B', 'B', 'B'},
                };
        assertArrayEquals(expected, actual);
    }
}

package com.fishercoder.thirdthousand;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import com.fishercoder.common.utils.CommonUtils;
import com.fishercoder.solutions.thirdthousand._2473;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _2473Test {
    private _2473.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _2473.Solution1();
    }

    @Test
    public void test1() {
        long[] actual =
                solution1.minCost(
                        4,
                        CommonUtils.convertLeetCodeIrregularLengths2DArrayInputIntoJavaArray(
                                "[1,2,4],[2,3,2],[2,4,5],[3,4,1],[1,3,4]"),
                        new int[] {56, 42, 102, 301},
                        2);
        assertArrayEquals(new long[] {54, 42, 48, 51}, actual);
    }

    @Test
    public void test2() {
        assertArrayEquals(
                new long[] {49117, 67662, 34318, 89780, 2747, 39709, 38302, 21966},
                solution1.minCost(
                        8,
                        CommonUtils.convertLeetCodeIrregularLengths2DArrayInputIntoJavaArray(
                                "[8,3,193],[4,1,890],[8,2,714],[7,2,654],[6,1,147]"),
                        new int[] {87310, 86029, 37141, 89780, 2747, 39709, 38302, 21966},
                        63));
    }
}

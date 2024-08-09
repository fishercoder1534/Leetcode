package com.fishercoder.firstthousand;

import com.fishercoder.common.utils.CommonUtils;
import com.fishercoder.solutions.firstthousand._212;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _212Test {
    private _212.Solution1 solution1;
    private _212.Solution2 solution2;

    @BeforeEach
    public void setup() {
        solution1 = new _212.Solution1();
        solution2 = new _212.Solution2();
    }

    @Test
    public void test1() {
        assertEquals(Arrays.asList("oa", "oaa"), solution1.findWords(CommonUtils.convertLeetCodeRegular2DCharArrayInputIntoJavaArray(
                        "[\"o\",\"a\",\"b\",\"n\"],[\"o\",\"t\",\"a\",\"e\"],[\"a\",\"h\",\"k\",\"r\"],[\"a\",\"f\",\"l\",\"v\"]"),
                new String[]{"oa", "oaa"}));
        assertEquals(Arrays.asList("oa", "oaa"), solution2.findWords(CommonUtils.convertLeetCodeRegular2DCharArrayInputIntoJavaArray(
                        "[\"o\",\"a\",\"b\",\"n\"],[\"o\",\"t\",\"a\",\"e\"],[\"a\",\"h\",\"k\",\"r\"],[\"a\",\"f\",\"l\",\"v\"]"),
                new String[]{"oa", "oaa"}));
    }

    @Test
    public void test2() {
        assertEquals(Arrays.asList("oath", "eat"), solution1.findWords(CommonUtils.convertLeetCodeRegular2DCharArrayInputIntoJavaArray(
                        "[\"o\",\"a\",\"a\",\"n\"],[\"e\",\"t\",\"a\",\"e\"],[\"i\",\"h\",\"k\",\"r\"],[\"i\",\"f\",\"l\",\"v\"]"),
                new String[]{"oath", "pea", "eat", "rain"}));
        assertEquals(Arrays.asList("oath", "eat"), solution2.findWords(CommonUtils.convertLeetCodeRegular2DCharArrayInputIntoJavaArray(
                        "[\"o\",\"a\",\"a\",\"n\"],[\"e\",\"t\",\"a\",\"e\"],[\"i\",\"h\",\"k\",\"r\"],[\"i\",\"f\",\"l\",\"v\"]"),
                new String[]{"oath", "pea", "eat", "rain"}));
    }

}

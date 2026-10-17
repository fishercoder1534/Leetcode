package com.fishercoder.fourththousand;

import com.fishercoder.common.utils.CommonUtils;
import com.fishercoder.solutions.fourththousand._3417;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _3417Test {
    private _3417.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _3417.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(
                Arrays.asList(2, 1, 2), solution1.zigzagTraversal(CommonUtils.convertLeetCodeIrregularLengths2DArrayInputIntoJavaArray("[2,1],[2,1],[2,1]")));
    }
}

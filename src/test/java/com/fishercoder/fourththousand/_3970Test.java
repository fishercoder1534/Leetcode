package com.fishercoder.fourththousand;

import com.fishercoder.common.utils.CommonUtils;
import com.fishercoder.solutions.fourththousand._3970;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _3970Test {
    private _3970.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _3970.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(3, solution1.shortestPath(3, CommonUtils.convertLeetCodeIrregularLengths2DArrayInputIntoJavaArray("[0,1,1],[1,2,1],[0,2,3]"), "aab", 1));
    }

}

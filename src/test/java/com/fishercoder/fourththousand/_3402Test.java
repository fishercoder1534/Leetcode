package com.fishercoder.fourththousand;

import com.fishercoder.common.utils.CommonUtils;
import com.fishercoder.solutions.fourththousand._3402;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _3402Test {
    private _3402.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _3402.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(15, solution1.minimumOperations(CommonUtils.convertLeetCodeIrregularLengths2DArrayInputIntoJavaArray("[3,2],[1,3],[3,4],[0,1]")));
    }
}

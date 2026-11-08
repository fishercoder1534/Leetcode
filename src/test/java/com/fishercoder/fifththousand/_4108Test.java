package com.fishercoder.fifththousand;

import com.fishercoder.common.utils.CommonUtils;
import com.fishercoder.solutions.fifththousand._4108;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _4108Test {
    private _4108.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _4108.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(1, solution1.minCost(3, "RBR", CommonUtils.convertLeetCodeIrregularLengths2DArrayInputIntoJavaArray("[0,1],[1,2]")));
    }

}

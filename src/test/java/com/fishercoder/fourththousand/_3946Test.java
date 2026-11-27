package com.fishercoder.fourththousand;

import com.fishercoder.common.utils.CommonUtils;
import com.fishercoder.solutions.fourththousand._3946;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _3946Test {
    private _3946.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _3946.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(4, solution1.maximumSaleItems(CommonUtils.convertLeetCodeIrregularLengths2DArrayInputIntoJavaArray("[6,2],[2,6],[3,4]"), 9));
    }

    @Test
    public void test2() {
        assertEquals(10, solution1.maximumSaleItems(CommonUtils.convertLeetCodeIrregularLengths2DArrayInputIntoJavaArray("[2,4],[3,2],[4,1],[6,4],[12,4]"), 8));
    }

}

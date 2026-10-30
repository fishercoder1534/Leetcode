package com.fishercoder.firstthousand;

import com.fishercoder.common.utils.CommonUtils;
import com.fishercoder.solutions.firstthousand._834;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class _834Test {
    private _834.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _834.Solution1();
    }

    @Test
    public void test1() {
        assertArrayEquals((new int[]{8, 12, 6, 10, 10, 10}),
                solution1.sumOfDistancesInTree(6,
                        CommonUtils.convertLeetCodeIrregularLengths2DArrayInputIntoJavaArray("[0,1],[0,2],[2,3],[2,4],[2,5]")))
        ;
    }

}

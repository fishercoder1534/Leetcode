package com.fishercoder.thirdthousand;

import com.fishercoder.common.utils.CommonUtils;
import com.fishercoder.solutions.thirdthousand._2966;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class _2966Test {
    private _2966.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _2966.Solution1();
    }

    @Test
    public void test1() {
        assertArrayEquals(CommonUtils.convertLeetCodeIrregularLengths2DArrayInputIntoJavaArray("[1,1,3],[3,4,5],[7,8,9]"), solution1.divideArray(new int[]{1, 3, 4, 8, 7, 9, 3, 5, 1}, 2));
    }
}

package com.fishercoder.secondthousand;

import com.fishercoder.common.utils.CommonUtils;
import com.fishercoder.solutions.secondthousand._1310;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class _1310Test {
    private _1310.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _1310.Solution1();
    }

    @Test
    public void test1() {
        assertArrayEquals(new int[]{2, 7, 14, 8}, solution1.xorQueries(new int[]{1, 3, 4, 8}, CommonUtils.convertLeetCodeIrregularLengths2DArrayInputIntoJavaArray("[0,1],[1,2],[0,3],[3,3]")));
    }

}

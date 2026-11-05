package com.fishercoder.fourththousand;

import com.fishercoder.common.utils.CommonUtils;
import com.fishercoder.solutions.fourththousand._3607;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class _3607Test {
    private _3607.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _3607.Solution1();
    }

    @Test
    public void test1() {
        assertArrayEquals(new int[]{3, 2, 3}, solution1.processQueries(5, CommonUtils.convertLeetCodeIrregularLengths2DArrayInputIntoJavaArray("[1,2],[2,3],[3,4],[4,5]"), CommonUtils.convertLeetCodeIrregularLengths2DArrayInputIntoJavaArray("[1,3],[2,1],[1,1],[2,2],[1,2]")));
    }

}

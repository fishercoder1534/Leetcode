package com.fishercoder.secondthousand;

import com.fishercoder.common.utils.CommonUtils;
import com.fishercoder.solutions.secondthousand._1443;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _1443Test {
    private _1443.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _1443.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(8,
                solution1.minTime(7, CommonUtils.convertLeetCodeIrregularLengths2DArrayInputIntoJavaArray("[0,1],[0,2],[1,4],[1,5],[2,3],[2,6]"), Arrays.asList(false, false, true, false, true, true, false)));
    }

}

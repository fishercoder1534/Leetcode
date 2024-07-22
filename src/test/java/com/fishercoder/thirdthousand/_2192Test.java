package com.fishercoder.thirdthousand;

import com.fishercoder.common.utils.CommonUtils;
import com.fishercoder.solutions.thirdthousand._2192;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _2192Test {
    private static _2192.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _2192.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(Arrays.asList(
                Arrays.asList(),
                Arrays.asList(),
                Arrays.asList(),
                Arrays.asList(0, 1),
                Arrays.asList(0, 2),
                Arrays.asList(0, 1, 3),
                Arrays.asList(0, 1, 2, 3, 4),
                Arrays.asList(0, 1, 2, 3)
        ), solution1.getAncestors(8,
                CommonUtils.convertLeetCodeRegularRectangleArrayInputIntoJavaArray(
                        "[0,3],[0,4],[1,3],[2,4],[2,7],[3,5],[3,6],[3,7],[4,6]")));
    }

}

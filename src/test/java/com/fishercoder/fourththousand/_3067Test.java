package com.fishercoder.fourththousand;

import com.fishercoder.common.utils.CommonUtils;
import com.fishercoder.solutions.fourththousand._3067;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class _3067Test {
    private _3067.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _3067.Solution1();
    }

    @Test
    public void test1() {
        assertArrayEquals(new int[]{0, 4, 6, 6, 4, 0}, solution1.countPairsOfConnectableServers(
                CommonUtils.convertLeetCodeIrregularLengths2DArrayInputIntoJavaArray("[0,1,1],[1,2,5],[2,3,13],[3,4,9],[4,5,2]"), 1
        ));
    }
}

package com.fishercoder.thirdthousand;

import com.fishercoder.common.utils.CommonUtils;
import com.fishercoder.solutions.thirdthousand._2257;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _2257Test {
    private _2257.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _2257.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(7, solution1.countUnguarded(4, 6, CommonUtils.convertLeetCodeIrregularLengths2DArrayInputIntoJavaArray("[0,0],[1,1],[2,3]"), CommonUtils.convertLeetCodeIrregularLengths2DArrayInputIntoJavaArray("[0,1],[2,2],[1,4]")));
    }
}

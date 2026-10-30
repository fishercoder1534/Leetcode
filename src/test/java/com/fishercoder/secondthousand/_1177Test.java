package com.fishercoder.secondthousand;

import com.fishercoder.common.utils.CommonUtils;
import com.fishercoder.solutions.secondthousand._1177;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _1177Test {
    private _1177.Solution1 solution1;
    private _1177.Solution2 solution2;

    @BeforeEach
    public void setup() {
        solution1 = new _1177.Solution1();
        solution2 = new _1177.Solution2();
    }

    @Test
    public void test1() {
        assertEquals(Arrays.asList(true, false, false, true, true), solution1.canMakePaliQueries("abcda", CommonUtils.convertLeetCodeIrregularLengths2DArrayInputIntoJavaArray("[3,3,0],[1,2,0],[0,3,1],[0,3,2],[0,4,1]")));
        assertEquals(Arrays.asList(true, false, false, true, true), solution2.canMakePaliQueries("abcda", CommonUtils.convertLeetCodeIrregularLengths2DArrayInputIntoJavaArray("[3,3,0],[1,2,0],[0,3,1],[0,3,2],[0,4,1]")));
    }

}
package com.fishercoder;

import com.fishercoder.common.utils.CommonUtils;
import com.fishercoder.solutions.first_thousand._47;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

public class _47Test {
    private static _47.Solution1 solution1;
    private static _47.Solution2 solution2;
    private static List<List<Integer>> actual;

    @BeforeEach
    public void setup() {
        solution1 = new _47.Solution1();
        solution2 = new _47.Solution2();
    }

    @Test
    public void test1() {
        actual = solution1.permuteUnique(new int[]{1, 1, 2});
        CommonUtils.printListList(actual);
        actual = solution2.permuteUnique(new int[]{1, 1, 2});
        CommonUtils.printListList(actual);
    }

}

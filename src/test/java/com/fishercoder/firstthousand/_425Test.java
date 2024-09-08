package com.fishercoder.firstthousand;

import com.fishercoder.common.utils.CommonUtils;
import com.fishercoder.solutions.firstthousand._425;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _425Test {
    private _425.Solution1 solution1;
    private static String[] words;

    @BeforeEach
    public void setup() {
        solution1 = new _425.Solution1();
    }

    @Test
    public void test1() {
        words = new String[] {"area", "lead", "wall", "lady", "ball"};
        List<List<String>> result = solution1.wordSquares(words);
        CommonUtils.printListList(result);
    }
}

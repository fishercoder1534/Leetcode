package com.fishercoder;

import com.fishercoder.common.utils.CommonUtils;
import com.fishercoder.solutions.first_thousand._46;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _46Test {
    private static _46.Solution1 solution1;
    private static _46.Solution2 solution2;
    private static _46.Solution3 solution3;

    @BeforeEach
    public void setup() {
        solution1 = new _46.Solution1();
        solution2 = new _46.Solution2();
        solution3 = new _46.Solution3();
    }

    @Test
    public void test1() {
        CommonUtils.printListList(solution1.permute(new int[]{1, 2, 3}));
        CommonUtils.printListList(solution2.permute(new int[]{1, 2, 3}));
        CommonUtils.printListList(solution3.permute(new int[]{1, 2, 3}));
    }

    @Test
    public void test2() {
        CommonUtils.printListList(solution1.permute(new int[]{1, 2, 3, 4, 5, 6}));
        CommonUtils.printListList(solution2.permute(new int[]{1, 2, 3, 4, 5, 6}));
        CommonUtils.printListList(solution3.permute(new int[]{1, 2, 3, 4, 5, 6}));
    }
}

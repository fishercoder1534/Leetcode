package com.fishercoder;

import com.fishercoder.common.utils.CommonUtils;
import com.fishercoder.solutions._46;
import org.junit.BeforeClass;
import org.junit.Test;

public class _46Test {
    private static _46.Solution1 solution1;

    @BeforeClass
    public static void setup() {
        solution1 = new _46.Solution1();
    }

    @Test
    public void test1() {
        CommonUtils.printListList(solution1.permute(new int[]{1, 2, 3}));
    }
}

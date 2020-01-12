package com.fishercoder;

import com.fishercoder.common.utils.CommonUtils;
import com.fishercoder.solutions._1213;
import org.junit.BeforeClass;
import org.junit.Test;

public class _1213Test {
    private static _1213.Solution1 solution1;

    @BeforeClass
    public static void setup() {
        solution1 = new _1213.Solution1();
    }

    @Test
    public void test1() {
        CommonUtils.printList(solution1.arraysIntersection(new int[]{1, 2, 3, 4, 5}, new int[]{1, 2, 5, 7, 9}, new int[]{1, 3, 4, 5, 8}));
    }

}

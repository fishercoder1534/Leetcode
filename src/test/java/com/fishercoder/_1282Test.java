package com.fishercoder;

import com.fishercoder.common.utils.CommonUtils;
import com.fishercoder.solutions._1282;
import org.junit.BeforeClass;
import org.junit.Test;

public class _1282Test {
    private static _1282.Solution1 solution1;
    private static int[] groupSizes;

    @BeforeClass
    public static void setup() {
        solution1 = new _1282.Solution1();
    }

    @Test
    public void test1() {
        groupSizes = new int[]{3, 3, 3, 3, 3, 1, 3};
        CommonUtils.printListList(solution1.groupThePeople(groupSizes));
    }

    @Test
    public void test2() {
        groupSizes = new int[]{2, 1, 3, 3, 3, 2};
        CommonUtils.printListList(solution1.groupThePeople(groupSizes));
    }

}
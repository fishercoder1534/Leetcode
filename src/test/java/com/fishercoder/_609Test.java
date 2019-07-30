package com.fishercoder;

import com.fishercoder.common.utils.CommonUtils;
import com.fishercoder.solutions._609;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.List;

public class _609Test {
    private static _609.Solution1 solution1;
    private static String[] paths;
    private static List<List<String>> actual;

    @BeforeClass
    public static void setup() {
        solution1 = new _609.Solution1();
    }

    @Test
    public void test1() {
        paths = new String[]{"root/a 1.txt(abcd) 2.txt(efgh)", "root/c 3.txt(abcd)", "root/c/d 4.txt(efgh)", "root 4.txt(efgh)"};
        actual = solution1.findDuplicate(paths);
        CommonUtils.printListList(actual);
    }
}

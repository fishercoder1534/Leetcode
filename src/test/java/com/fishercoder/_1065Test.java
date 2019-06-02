package com.fishercoder;

import com.fishercoder.common.utils.CommonUtils;
import com.fishercoder.solutions._1065;
import org.junit.BeforeClass;
import org.junit.Test;

public class _1065Test {
    private static _1065.Solution1 solution1;

    @BeforeClass
    public static void setup() {
        solution1 = new _1065.Solution1();
    }

    @Test
    public void test1() {
        CommonUtils.print2DIntArray(solution1.indexPairs("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", new String[]{"aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"}));
    }

    @Test
    public void test2() {
        CommonUtils.print2DIntArray(solution1.indexPairs("thestoryofleetcodeandme", new String[]{"story", "fleet", "leetcode"}));
    }

    @Test
    public void test3() {
        CommonUtils.print2DIntArray(solution1.indexPairs("ababa", new String[]{"aba", "ab"}));
    }

    @Test
    public void test4() {
        CommonUtils.print2DIntArray(solution1.indexPairs("aabaabbaabbaababaaaaaababaabaabaabaababbaabbbbaabbaaababbbbaabbabbabbababbabaabaaaabaabbbb", new String[]{"aabaaabbaba", "bbabbbaaabaaaab", "ababaabaababb", "bbbaaabababbba", "baaaabbaa"}));
    }

}
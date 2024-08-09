package com.fishercoder.secondthousand;

import com.fishercoder.common.utils.CommonUtils;
import com.fishercoder.solutions.secondthousand._1065;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _1065Test {
    private _1065.Solution1 solution1;

    @BeforeEach
    public void setup() {
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
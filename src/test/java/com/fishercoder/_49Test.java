package com.fishercoder;

import com.fishercoder.solutions._49;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.commons.collections4.CollectionUtils;
import org.junit.BeforeClass;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;
import static org.assertj.core.api.Assertions.assertThat;

public class _49Test {
    private static _49.Solution1 solution1;
    private static String[] words;
    private static List<List<String>> expected;
    private static List<List<String>> actual;

    @BeforeClass
    public static void setup() {
        solution1 = new _49.Solution1();
    }

    @Test
    public void test1() {
        words = new String[]{"eat", "tea", "tan", "ate", "nat", "bat"};
        List<String> e1 = Arrays.asList("bat");
        List<String> e2 = Arrays.asList("tan", "nat");
        List<String> e3 = Arrays.asList("ate", "eat", "tea");
        expected = Arrays.asList(e1, e2, e3);
        actual = solution1.groupAnagrams(words);
        assertEquals(expected.size(), actual.size());
        assertEquals(expected.containsAll(actual), actual.containsAll(expected));
        for (List<String> a : actual) {
            switch (a.size()) {
                case 1:
                    assertTrue(CollectionUtils.isEqualCollection(e1, a));
                    break;
                case 2:
                    assertTrue(CollectionUtils.isEqualCollection(e2, a));
                    break;
                case 3:
                    assertTrue(CollectionUtils.isEqualCollection(e3, a));
                    break;
                default:
                    //Should not have come into this branch ever.
                    assertTrue(false);
            }
        }
    }
}

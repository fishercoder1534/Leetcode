package com.fishercoder;

import com.fishercoder.solutions._1152;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class _1152Test {
    private static _1152.Solution1 solution1;

    @BeforeClass
    public static void setup() {
        solution1 = new _1152.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(Arrays.asList("home", "about", "career"), solution1.mostVisitedPattern(new String[]{"joe", "joe", "joe", "james", "james", "james", "james", "mary", "mary", "mary"}, new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, new String[]{"home", "about", "career", "home", "cart", "maps", "home", "home", "about", "career"}));
    }

    @Test
    public void test2() {
        assertEquals(Arrays.asList("oz", "mryxsjc", "wlarkzzqht"), solution1.mostVisitedPattern(new String[]{"zkiikgv", "zkiikgv", "zkiikgv", "zkiikgv"}, new int[]{436363475, 710406388, 386655081, 797150921}, new String[]{"wnaaxbfhxp", "mryxsjc", "oz", "wlarkzzqht"}));
    }

    @Test
    public void test3() {
        assertEquals(Arrays.asList("hibympufi", "hibympufi", "yljmntrclw"), solution1.mostVisitedPattern(new String[]{"h", "eiy", "cq", "h", "cq", "txldsscx", "cq", "txldsscx", "h", "cq", "cq"}, new int[]{527896567, 334462937, 517687281, 134127993, 859112386, 159548699, 51100299, 444082139, 926837079, 317455832, 411747930}, new String[]{"hibympufi", "hibympufi", "hibympufi", "hibympufi", "hibympufi", "hibympufi", "hibympufi", "hibympufi", "yljmntrclw", "hibympufi", "yljmntrclw"}));
    }
}
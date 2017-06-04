package com.fishercoder;

import com.fishercoder.common.utils.CommonUtils;
import com.fishercoder.solutions._332;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.List;

/**
 * Created by stevesun on 6/3/17.
 */
public class _332Test {
    private static _332 test;
    private static String[][] tickets;
    private static List<String> expected;

    @BeforeClass
    public static void setup(){
        test = new _332();
    }

    @Test
    public void test1(){
        tickets = new String[][]{{"MUC", "LHR"}, {"JFK", "MUC"}, {"SFO", "SJC"}, {"LHR", "SFO"}};
        expected = test.findItinerary(tickets);
        CommonUtils.print(expected);
    }

    @Test
    public void test2(){
        tickets = new String[][]{{"JFK","SFO"},{"JFK","ATL"},{"SFO","ATL"},{"ATL","JFK"},{"ATL","SFO"}};
        expected = test.findItinerary(tickets);
        CommonUtils.print(expected);
    }
}

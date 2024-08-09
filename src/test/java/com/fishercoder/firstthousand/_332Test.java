package com.fishercoder.firstthousand;

import com.fishercoder.common.utils.CommonUtils;
import com.fishercoder.solutions.firstthousand._332;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _332Test {
    private _332.Solution1 solution1;
    private static List<List<String>> tickets;
    private static List<String> expected;

    @BeforeEach
    public void setup() {
        solution1 = new _332.Solution1();
    }

    @Test
    public void test1() {
        tickets = new ArrayList<>();
        tickets.add(Arrays.asList("MUC", "LHR"));
        tickets.add(Arrays.asList("JFK", "MUC"));
        tickets.add(Arrays.asList("SFO", "SJC"));
        tickets.add(Arrays.asList("LHR", "SFO"));
        expected = solution1.findItinerary(tickets);
        CommonUtils.print(expected);
    }

    @Test
    public void test2() {
        tickets = new ArrayList<>();
        tickets.add(Arrays.asList("JFK", "SFO"));
        tickets.add(Arrays.asList("JFK", "ATL"));
        tickets.add(Arrays.asList("SFO", "ATL"));
        tickets.add(Arrays.asList("ATL", "JFK"));
        tickets.add(Arrays.asList("ATL", "SFO"));
        expected = solution1.findItinerary(tickets);
        CommonUtils.print(expected);
    }
}

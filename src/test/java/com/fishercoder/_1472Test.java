package com.fishercoder;

import com.fishercoder.solutions.secondthousand._1472;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _1472Test {
    private static _1472.Solution1.BrowserHistory browserHistory;

    @Test
    public void test1() {
        browserHistory = new _1472.Solution1.BrowserHistory("leetcode.com");
        browserHistory.visit("google.com");
        browserHistory.visit("facebook.com");
        browserHistory.visit("youtube.com");
        assertEquals("facebook.com", browserHistory.back(1));
        assertEquals("google.com", browserHistory.back(1));
        assertEquals("facebook.com", browserHistory.forward(1));
        browserHistory.visit("linkedin.com");
        assertEquals("linkedin.com", browserHistory.forward(2));
        assertEquals("google.com", browserHistory.back(2));
        assertEquals("leetcode.com", browserHistory.back(7));
    }

}

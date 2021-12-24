package com.fishercoder.solutions;

import java.util.ArrayList;
import java.util.List;

public class _1472 {
    public static class Solution1 {
        public static class BrowserHistory {

            int curr;
            List<String> history;

            public BrowserHistory(String homepage) {
                history = new ArrayList<>();
                history.add(homepage);
                curr = 0;
            }

            public void visit(String url) {
                curr++;
                history = history.subList(0, curr);
                history.add(url);
            }

            public String back(int steps) {
                curr -= steps;
                if (curr < 0) {
                    curr = 0;
                }
                return history.get(curr);
            }

            public String forward(int steps) {
                curr += steps;
                if (history.size() <= curr) {
                    curr = history.size() - 1;
                }
                return history.get(curr);
            }
        }

    }
}

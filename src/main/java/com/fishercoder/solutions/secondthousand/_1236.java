package com.fishercoder.solutions.secondthousand;

import java.util.*;

public class _1236 {
    interface HtmlParser {
        List<String> getUrls(String url);
    }

    public static class Solution1 {
        /**
         * My original solution, a simple and elegant DFS!
         */
        public List<String> crawl(String startUrl, HtmlParser htmlParser) {
            String validHostname = getHostname(startUrl);
            List<String> ans = new ArrayList<>();
            Set<String> visited = new HashSet<>();
            dfs(validHostname, startUrl, htmlParser, visited, ans);
            Collections.sort(ans);
            return ans;
        }

        private String getHostname(String startUrl) {
            StringBuilder sb = new StringBuilder(startUrl.substring(0, 7));
            for (int i = 7; i < startUrl.length(); i++) {
                if (startUrl.charAt(i) != '/') {
                    sb.append(startUrl.charAt(i));
                } else {
                    return sb.toString();
                }
            }
            return sb.toString();
        }

        private void dfs(String validHostname, String startUrl, HtmlParser htmlParser, Set<String> visited, List<String> ans) {
            //base case
            if (visited.contains(startUrl)) {
                return;
            }
            visited.add(startUrl);
            if (startUrl.startsWith(validHostname)) {
                ans.add(startUrl);
            }
            List<String> urls = htmlParser.getUrls(startUrl);
            for (String url : urls) {
                if (url.startsWith(validHostname)) {
                    dfs(validHostname, url, htmlParser, visited, ans);
                }
            }
        }
    }
}

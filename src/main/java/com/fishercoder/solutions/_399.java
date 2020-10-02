package com.fishercoder.solutions;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class _399 {

    public static class Solution1 {
        /**
         * Credit: https://medium.com/@null00/leetcode-evaluate-division-52a0158488c1
         */
        private Map<String, String> root;
        private Map<String, Double> rate;

        public double[] calcEquation(List<List<String>> equations, double[] values, List<List<String>> queries) {
            root = new HashMap<>();
            rate = new HashMap<>();
            int n = equations.size();
            for (int i = 0; i < n; ++i) {
                String X = equations.get(i).get(0);
                String Y = equations.get(i).get(1);
                root.put(X, X);
                root.put(Y, Y);
                rate.put(X, 1.0);
                rate.put(Y, 1.0);
            }

            for (int i = 0; i < n; ++i) {
                String X = equations.get(i).get(0);
                String Y = equations.get(i).get(1);
                union(X, Y, values[i]);
            }

            double[] result = new double[queries.size()];
            for (int i = 0; i < queries.size(); ++i) {
                String X = queries.get(i).get(0);
                String Y = queries.get(i).get(1);
                if (!root.containsKey(X) || !root.containsKey(Y)) {
                    result[i] = -1;
                    continue;
                }

                String rootx = findRoot(X, X, 1.0);
                String rooty = findRoot(Y, Y, 1.0);
                result[i] = rootx.equals(rooty) ? rate.get(X) / rate.get(Y) : -1.0;
            }

            return result;
        }

        private void union(String X, String Y, double v) {
            String rootx = findRoot(X, X, 1.0);
            String rooty = findRoot(Y, Y, 1.0);
            root.put(rootx, rooty);
            double r1 = rate.get(X);
            double r2 = rate.get(Y);
            rate.put(rootx, v * r2 / r1);
        }

        private String findRoot(String originalX, String X, double r) {
            if (root.get(X).equals(X)) {
                root.put(originalX, X);
                rate.put(originalX, r * rate.get(X));
                return X;
            }

            return findRoot(originalX, root.get(X), r * rate.get(X));
        }
    }
}

package com.fishercoder.solutions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

/**
 * 399. Evaluate Division
 *
 * Equations are given in the format A / B = k, where A and B are variables represented as strings, and k is a real number (floating point number).
 * Given some queries, return the answers. If the answer does not exist, return -1.0.

 Example:
 Given a / b = 2.0, b / c = 3.0.
 queries are: a / c = ?, b / a = ?, a / e = ?, a / a = ?, x / x = ? .
 return [6.0, 0.5, -1.0, 1.0, -1.0 ].

 The input is: vector<pair<string, string>> equations, vector<double>& values, vector<pair<string, string>> queries ,
 where equations.size() == values.size(), and the values are positive. This represents the equations. Return vector<double>.

 According to the example above:

 equations = [ ["a", "b"], ["b", "c"] ],
 values = [2.0, 3.0],
 queries = [ ["a", "c"], ["b", "a"], ["a", "e"], ["a", "a"], ["x", "x"] ].

 The input is always valid. You may assume that evaluating the queries will result in no division by zero and there is no contradiction.
 */
public class _399 {

    public static class Solution1 {
        /**
         * Credit: https://discuss.leetcode.com/topic/59146/java-ac-solution-using-graph
         *
         * Image a/b = k as a link between node a and b, the weight from a to b is k, the reverse link
         * is 1/k. Query is to find a path between two nodes.
         */
        public double[] calcEquation(String[][] equations, double[] values, String[][] queries) {
            Map<String, List<String>> pairs = new HashMap<>();
            Map<String, List<Double>> valuePairs = new HashMap<>();
            for (int i = 0; i < equations.length; i++) {
                String[] equation = equations[i];
                if (!pairs.containsKey(equation[0])) {
                    pairs.put(equation[0], new ArrayList<>());
                    valuePairs.put(equation[0], new ArrayList<>());
                }
                if (!pairs.containsKey(equation[1])) {
                    pairs.put(equation[1], new ArrayList<>());
                    valuePairs.put(equation[1], new ArrayList<>());
                }
                pairs.get(equation[0]).add(equation[1]);
                pairs.get(equation[1]).add(equation[0]);
                valuePairs.get(equation[0]).add(values[i]);
                valuePairs.get(equation[1]).add(1 / values[i]);
            }

            double[] result = new double[queries.length];
            for (int i = 0; i < queries.length; i++) {
                String[] query = queries[i];
                result[i] = dfs(query[0], query[1], pairs, valuePairs, new HashSet<>(), 1.0);
                if (result[i] == 0.0) {
                    result[i] = -1.0;
                }
            }
            return result;
        }

        private double dfs(String start, String end, Map<String, List<String>> pairs,
            Map<String, List<Double>> valuePairs, HashSet<String> set, double value) {
            if (set.contains(start)) {
                return 0.0;
            }
            if (!pairs.containsKey(start)) {
                return 0.0;
            }
            if (start.equals(end)) {
                return value;
            }
            set.add(start);

            List<String> stringList = pairs.get(start);
            List<Double> valueList = valuePairs.get(start);
            double tmp = 0.0;
            for (int i = 0; i < stringList.size(); i++) {
                tmp = dfs(stringList.get(i), end, pairs, valuePairs, set, value * valueList.get(i));
                if (tmp != 0.0) {
                    break;
                }
            }
            set.remove(start);
            return tmp;
        }
    }
}

package com.fishercoder.solutions;

import java.util.HashMap;
import java.util.Stack;

public class _631 {

    public static class Solution1 {
        /**
         * Credit: https://leetcode.com/articles/design-excel-sum-formula/#approach-1-using-topological-sortaccepted
         */
        public static class Excel {

            Formula[][] formulas;

            class Formula {
                Formula(HashMap<String, Integer> c, int v) {
                    val = v;
                    cells = c;
                }

                HashMap<String, Integer> cells;
                int val;
            }

            Stack<int[]> stack = new Stack<>();

            public Excel(int H, char W) {
                formulas = new Formula[H][(W - 'A') + 1];
            }

            public int get(int r, char c) {
                if (formulas[r - 1][c - 'A'] == null) {
                    return 0;
                }
                return formulas[r - 1][c - 'A'].val;
            }

            public void set(int r, char c, int v) {
                formulas[r - 1][c - 'A'] = new Formula(new HashMap<String, Integer>(), v);
                topologicalSort(r - 1, c - 'A');
                execute_stack();
            }

            public int sum(int r, char c, String[] strs) {
                HashMap<String, Integer> cells = convert(strs);
                int summ = calculate_sum(r - 1, c - 'A', cells);
                set(r, c, summ);
                formulas[r - 1][c - 'A'] = new Formula(cells, summ);
                return summ;
            }

            public void topologicalSort(int r, int c) {
                for (int i = 0; i < formulas.length; i++) {
                    for (int j = 0; j < formulas[0].length; j++) {
                        if (formulas[i][j] != null && formulas[i][j].cells.containsKey("" + (char) ('A' + c) + (r + 1))) {
                            topologicalSort(i, j);
                        }
                    }
                }
                stack.push(new int[]{r, c});
            }

            public void execute_stack() {
                while (!stack.isEmpty()) {
                    int[] top = stack.pop();
                    if (formulas[top[0]][top[1]].cells.size() > 0) {
                        calculate_sum(top[0], top[1], formulas[top[0]][top[1]].cells);
                    }
                }
            }

            public HashMap<String, Integer> convert(String[] strs) {
                HashMap<String, Integer> res = new HashMap<>();
                for (String st : strs) {
                    if (st.indexOf(":") < 0) {
                        res.put(st, res.getOrDefault(st, 0) + 1);
                    } else {
                        String[] cells = st.split(":");
                        int si = Integer.parseInt(cells[0].substring(1));
                        int ei = Integer.parseInt(cells[1].substring(1));
                        char sj = cells[0].charAt(0);
                        char ej = cells[1].charAt(0);
                        for (int i = si; i <= ei; i++) {
                            for (char j = sj; j <= ej; j++) {
                                res.put("" + j + i, res.getOrDefault("" + j + i, 0) + 1);
                            }
                        }
                    }
                }
                return res;
            }

            public int calculate_sum(int r, int c, HashMap<String, Integer> cells) {
                int sum = 0;
                for (String s : cells.keySet()) {
                    int x = Integer.parseInt(s.substring(1)) - 1;
                    int y = s.charAt(0) - 'A';
                    sum += (formulas[x][y] != null ? formulas[x][y].val : 0) * cells.get(s);
                }
                formulas[r][c] = new Formula(cells, sum);
                return sum;
            }
        }
    }

    /**
     * Your Excel object will be instantiated and called as such:
     * Excel obj = new Excel(H, W);
     * obj.set(r,c,v);
     * int param_2 = obj.get(r,c);
     * int param_3 = obj.sum(r,c,strs);
     */

}

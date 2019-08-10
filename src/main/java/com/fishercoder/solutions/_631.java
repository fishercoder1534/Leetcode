package com.fishercoder.solutions;

import java.util.HashMap;
import java.util.Stack;

/**
 * 631. Design Excel Sum Formula
 *
 * Your task is to design the basic function of Excel and implement the function of sum formula.
 * Specifically, you need to implement the following functions:

 Excel(int H, char W):
 This is the constructor.
 The inputs represents the height and width of the Excel form.
 H is a positive integer, range from 1 to 26.
 It represents the height.
 W is a character range from 'A' to 'Z'.
 It represents that the width is the number of characters from 'A' to W.
 The Excel form content is represented by a height * width 2D integer array C, it should be initialized to zero.
 You should assume that the first row of C starts from 1, and the first column of C starts from 'A'.

 void Set(int row, char column, int val):
 Change the value at C(row, column) to be val.

 int Get(int row, char column):
 Return the value at C(row, column).

 int Sum(int row, char column, List of Strings : numbers):
 This function calculate and set the value at C(row, column),
 where the value should be the sum of cells represented by numbers.
 This function return the sum result at C(row, column).
 This sum formula should exist until this cell is overlapped by another value or another sum formula.

 numbers is a list of strings that each string represent a cell or a range of cells.
 If the string represent a single cell,
 then it has the following format : ColRow. For example, "F7" represents the cell at (7, F).
 If the string represent a range of cells,
 then it has the following format : ColRow1:ColRow2.
 The range will always be a rectangle,
 and ColRow1 represent the position of the top-left cell,
 and ColRow2 represents the position of the bottom-right cell.


 Example 1:
 Excel(3,"C");
 // construct a 3*3 2D array with all zero.
 //   A B C
 // 1 0 0 0
 // 2 0 0 0
 // 3 0 0 0

 Set(1, "A", 2);
 // set C(1,"A") to be 2.
 //   A B C
 // 1 2 0 0
 // 2 0 0 0
 // 3 0 0 0

 Sum(3, "C", ["A1", "A1:B2"]);
 // set C(3,"C") to be the sum of value at C(1,"A")
 //and the values sum of the rectangle range whose top-left cell is C(1,"A") and bottom-right cell is C(2,"B"). Return 4.
 //   A B C
 // 1 2 0 0
 // 2 0 0 0
 // 3 0 0 4

 Set(2, "B", 2);
 // set C(2,"B") to be 2. Note C(3, "C") should also be changed.
 //   A B C
 // 1 2 0 0
 // 2 0 2 0
 // 3 0 0 6

 Note:
 You could assume that there won't be any circular sum reference.
 For example, A1 = sum(B1) and B1 = sum(A1).
 The test cases are using double-quotes to represent a character.
 Please remember to RESET your class variables declared in class Excel,
 as static/class variables are persisted across multiple test cases. Please see here for more details.
 */
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

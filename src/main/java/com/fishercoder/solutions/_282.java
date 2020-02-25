package com.fishercoder.solutions;

import java.util.ArrayList;
import java.util.List;

/**
 * 282. Expression Add Operators
 *
 * Given a string that contains only digits 0-9 and a target value,
 * return all possibilities to add binary operators (not unary) +, -, or * between the digits
 * so they evaluate to the target value.

 Examples:
 "123", 6 -> ["1+2+3", "1*2*3"]
 "232", 8 -> ["2*3+2", "2+3*2"]
 "105", 5 -> ["1*0+5","10-5"]
 "00", 0 -> ["0+0", "0-0", "0*0"]
 "3456237490", 9191 -> []
 */
public class _282 {

    public static class Solution1 {
        public List<String> addOperators(String num, int target) {
            List<String> res = new ArrayList<>();
            StringBuilder sb = new StringBuilder();
            dfs(res, sb, num, 0, target, 0, 0);
            return res;

        }

        private void dfs(List<String> res, StringBuilder sb, String num, int pos, int target, long prev, long multi) {
            if (pos == num.length()) {
                if (target == prev) {
                    res.add(sb.toString());
                }
                return;
            }
            for (int i = pos; i < num.length(); i++) {
                if (num.charAt(pos) == '0' && i != pos) {
                    break;
                }
                long curr = Long.parseLong(num.substring(pos, i + 1));
                int len = sb.length();
                if (pos == 0) {
                    dfs(res, sb.append(curr), num, i + 1, target, curr, curr);
                    sb.setLength(len);
                } else {
                    dfs(res, sb.append("+").append(curr), num, i + 1, target, prev + curr, curr);
                    sb.setLength(len);

                    dfs(res, sb.append("-").append(curr), num, i + 1, target, prev - curr, -curr);
                    sb.setLength(len);

                    dfs(res, sb.append("*").append(curr), num, i + 1, target, prev - multi + multi * curr, multi * curr);
                    sb.setLength(len);
                }
            }
        }
    }

}

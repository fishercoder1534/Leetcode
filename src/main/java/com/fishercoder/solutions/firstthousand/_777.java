package com.fishercoder.solutions.firstthousand;

public class _777 {
    public static class Solution1 {
        public boolean canTransform(String start, String end) {
            StringBuilder sb = new StringBuilder();
            for (char c : start.toCharArray()) {
                if (c != 'X') {
                    sb.append(c);
                }
            }
            String cleanedStart = sb.toString();
            sb.setLength(0);
            for (char c : end.toCharArray()) {
                if (c != 'X') {
                    sb.append(c);
                }
            }
            String cleandEnd = sb.toString();
            if (!cleanedStart.equals(cleandEnd)) {
                return false;
            }

            //check R from left, check on the start string for R first
            //whenever count becomes negative, this means we encounter an R in a more left position in end string than start string
            //since R could only be moved to the right in the start string, there's no way that start string could be shifted to match end string
            //test11 illustrates this well
            int count = 0;
            for (int i = 0; i < start.length(); i++) {
                if (start.charAt(i) == 'R') {
                    count++;
                }
                if (end.charAt(i) == 'R') {
                    count--;
                }
                if (count < 0) {
                    return false;
                }
            }
            //check L from left, but check on the end string first,
            //this means if L is in a more left index in start string than end string, it's impossible for start to match end
            //test12 illustrates this case well
            count = 0;
            for (int i = 0; i < end.length(); i++) {
                if (end.charAt(i) == 'L') {
                    count++;
                }
                if (start.charAt(i) == 'L') {
                    count--;
                }
                if (count < 0) {
                    return false;
                }
            }
            return true;
        }

    }
}

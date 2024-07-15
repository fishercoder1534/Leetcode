package com.fishercoder.solutions.thirdthousand;

public class _2409 {
    public static class Solution1 {
        /**
         * Brute force: check each day of the 365 days if both of them are in Rome.
         */
        public int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {
            int[] monthToDays = new int[]{0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
            int days = 0;
            String[] arriveAliceParts = arriveAlice.split("-");
            String[] leaveAliceParts = leaveAlice.split("-");
            String[] arriveBobParts = arriveBob.split("-");
            String[] leaveBobParts = leaveBob.split("-");
            for (int i = 1; i < monthToDays.length; i++) {
                int daysInMonth = monthToDays[i];
                for (int j = 1; j <= daysInMonth; j++) {
                    if (bothInRome(i, j, arriveAliceParts, leaveAliceParts, arriveBobParts, leaveBobParts)) {
                        days++;
                    }
                }
            }
            return days;
        }

        private boolean bothInRome(int month, int day, String[] arriveAliceParts, String[] leaveAliceParts, String[] arriveBobParts, String[] leaveBobParts) {
            int aliceArriveMonth = Integer.parseInt(arriveAliceParts[0]);
            int aliceArriveDay = Integer.parseInt(arriveAliceParts[1]);
            int aliceLeaveMonth = Integer.parseInt(leaveAliceParts[0]);
            int aliceLeaveDay = Integer.parseInt(leaveAliceParts[1]);

            int bobArriveMonth = Integer.parseInt(arriveBobParts[0]);
            int bobArriveDay = Integer.parseInt(arriveBobParts[1]);
            int bobLeaveMonth = Integer.parseInt(leaveBobParts[0]);
            int bobLeaveDay = Integer.parseInt(leaveBobParts[1]);

            return inRome(aliceArriveMonth, aliceArriveDay, aliceLeaveMonth, aliceLeaveDay, month, day) && inRome(bobArriveMonth, bobArriveDay, bobLeaveMonth, bobLeaveDay, month, day);
        }

        private boolean inRome(int arriveMonth, int arriveDay, int leaveMonth, int leaveDay, int month, int day) {
            if (month < arriveMonth || month > leaveMonth) {
                return false;
            }
            if (month > arriveMonth && month < leaveMonth) {
                return true;
            }
            if (month == arriveMonth) {
                if (arriveMonth == leaveMonth) {
                    return arriveDay <= day && leaveDay >= day;
                } else {
                    return arriveDay <= day;
                }
            }
            //now, only this case: month == leaveMonth
            return day <= leaveDay;
        }
    }
}

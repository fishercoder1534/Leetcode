package com.fishercoder.solutions;

/**
 * 1344. Angle Between Hands of a Clock
 *
 * Given two numbers, hour and minutes. Return the smaller angle (in sexagesimal units) formed between the hour and the minute hand.
 *
 * Example 1:
 * Input: hour = 12, minutes = 30
 * Output: 165
 *
 * Example 2:
 * Input: hour = 3, minutes = 30
 * Output: 75
 *
 * Example 3:
 * Input: hour = 3, minutes = 15
 * Output: 7.5
 *
 * Example 4:
 * Input: hour = 4, minutes = 50
 * Output: 155
 *
 * Example 5:
 * Input: hour = 12, minutes = 0
 * Output: 0
 *
 * Constraints:
 * 1 <= hour <= 12
 * 0 <= minutes <= 59
 * Answers within 10^-5 of the actual value will be accepted as correct.
 * */
public class _1344 {
    public static class Solution1 {
        public double angleClock(int hour, int minutes) {
            double minAngle = minutes * 360 / 60;
            double hourAnglePart1 = hour != 12 ? (hour * 360) / 12 : 0;
            double hourAnglePart2 = (double) (30 * minutes) / (double) 60;
            double hourAngle = hourAnglePart1 + hourAnglePart2;
            double preResult = Math.abs(minAngle - (hourAngle));
            return preResult > 180 ? 360 - preResult : preResult;
        }
    }
}

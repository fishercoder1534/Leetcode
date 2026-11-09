package com.fishercoder.solutions.thirdthousand;

import java.util.HashMap;
import java.util.Map;

public class _3846 {
    public static class Solution1 {
        public int totalDistance(String s) {
            Map<Character, int[]> keyboard = new HashMap<>();
            keyboard.put('q', new int[]{0, 0});
            keyboard.put('w', new int[]{0, 1});
            keyboard.put('e', new int[]{0, 2});
            keyboard.put('r', new int[]{0, 3});
            keyboard.put('t', new int[]{0, 4});
            keyboard.put('y', new int[]{0, 5});
            keyboard.put('u', new int[]{0, 6});
            keyboard.put('i', new int[]{0, 7});
            keyboard.put('o', new int[]{0, 8});
            keyboard.put('p', new int[]{0, 9});
            keyboard.put('a', new int[]{1, 0});
            keyboard.put('s', new int[]{1, 1});
            keyboard.put('d', new int[]{1, 2});
            keyboard.put('f', new int[]{1, 3});
            keyboard.put('g', new int[]{1, 4});
            keyboard.put('h', new int[]{1, 5});
            keyboard.put('j', new int[]{1, 6});
            keyboard.put('k', new int[]{1, 7});
            keyboard.put('l', new int[]{1, 8});
            keyboard.put('z', new int[]{2, 0});
            keyboard.put('x', new int[]{2, 1});
            keyboard.put('c', new int[]{2, 2});
            keyboard.put('v', new int[]{2, 3});
            keyboard.put('b', new int[]{2, 4});
            keyboard.put('n', new int[]{2, 5});
            keyboard.put('m', new int[]{2, 6});
            int distance = 0;
            int currX = 1;
            int currY = 0;
            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                int nextX = keyboard.get(c)[0];
                int nextY = keyboard.get(c)[1];
                distance += Math.abs(nextX - currX) + Math.abs(nextY - currY);
                currX = nextX;
                currY = nextY;
            }
            return distance;
        }
    }
}

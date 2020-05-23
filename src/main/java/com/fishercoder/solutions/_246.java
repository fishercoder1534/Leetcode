package com.fishercoder.solutions;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class _246 {

    public static class Solution1 {
        public boolean isStrobogrammatic(String num) {
            int i = 0;
            int j = num.length() - 1;
            Map<Character, Character> map = new HashMap();
            map.put('8', '8');
            map.put('1', '1');
            map.put('0', '0');
            if (j == 0) {
                return map.containsKey(num.charAt(i));
            }

            map.put('9', '6');
            map.put('6', '9');
            while (i < j) {
                if (!map.containsKey(num.charAt(i)) || !map.containsKey(num.charAt(j))) {
                    return false;
                }
                if (map.get(num.charAt(i)) != num.charAt(j)) {
                    return false;
                }
                i++;
                j--;
            }
            return map.containsKey(num.charAt(i));
        }
    }


    public static class Solution2 {
        public boolean isStrobogrammatic(String num) {
            Set<Character> set = new HashSet();
            set.add('0');
            set.add('1');
            set.add('6');
            set.add('8');
            set.add('9');
            char[] nums = num.toCharArray();
            int i = 0;
            int j = num.length() - 1;
            while (i <= j) {
                if (!set.contains(nums[i]) || !set.contains(nums[j])) {
                    return false;
                }
                if (nums[i] == '6' && nums[j] != '9') {
                    return false;
                } else if (nums[i] == '9' && nums[j] != '6') {
                    return false;
                } else if (nums[i] == '1' && nums[j] != '1') {
                    return false;
                } else if (nums[i] == '8' && nums[j] != '8') {
                    return false;
                } else if (nums[i] == '0' && nums[j] != '0') {
                    return false;
                } else {
                    i++;
                    j--;
                }
            }
            return true;
        }
    }
}

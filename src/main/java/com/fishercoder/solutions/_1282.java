package com.fishercoder.solutions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 1282. Group the People Given the Group Size They Belong To
 *
 * There are n people whose IDs go from 0 to n - 1 and each person belongs exactly to one group.
 * Given the array groupSizes of length n telling the group size each person belongs to, return the groups there are and the people's IDs each group includes.
 * You can return any solution in any order and the same applies for IDs.
 * Also, it is guaranteed that there exists at least one solution.
 *
 * Example 1:
 * Input: groupSizes = [3,3,3,3,3,1,3]
 * Output: [[5],[0,1,2],[3,4,6]]
 * Explanation:
 * Other possible solutions are [[2,1,6],[5],[0,4,3]] and [[5],[0,6,2],[4,3,1]].
 *
 * Example 2:
 * Input: groupSizes = [2,1,3,3,3,2]
 * Output: [[1],[0,5],[2,3,4]]
 *
 * Constraints:
 * groupSizes.length == n
 * 1 <= n <= 500
 * 1 <= groupSizes[i] <= n
 * */
public class _1282 {
    public static class Solution1 {
        public List<List<Integer>> groupThePeople(int[] groupSizes) {
            Map<Integer, List<Integer>> map = new HashMap<>();
            for (int i = 0; i < groupSizes.length; i++) {
                List<Integer> list = map.getOrDefault(groupSizes[i], new ArrayList<>());
                list.add(i);
                map.put(groupSizes[i], list);
            }
            List<List<Integer>> result = new ArrayList<>();
            for (int key : map.keySet()) {
                List<Integer> list = map.get(key);
                int i = 0;
                do {
                    result.add(list.subList(i, i + key));
                    i += key;
                } while (i + key <= list.size());
            }
            return result;
        }
    }
}

package com.fishercoder.solutions;

import com.fishercoder.common.classes.TreeNode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class _508 {

    public static class Solution1 {
        //my purely original but verbose solution
        public int[] findFrequentTreeSum(TreeNode root) {
            if (root == null) {
                return new int[]{};
            }

            Map<TreeNode, Integer> map = new HashMap();
            postOrder(root, map);

            Map<Integer, Integer> frequencyMap = new HashMap<>();
            for (Map.Entry entry : map.entrySet()) {
                frequencyMap.put((Integer) entry.getValue(), frequencyMap.getOrDefault(entry.getValue(), 0) + 1);
            }

            List<Map.Entry<Integer, Integer>> list = new LinkedList<>(frequencyMap.entrySet());
            Collections.sort(list, (o1, o2) -> (o2.getValue()).compareTo(o1.getValue()));

            int mostFrequency = list.get(0).getValue();
            List<Integer> topFrequencyList = new ArrayList<>();
            topFrequencyList.add(list.get(0).getKey());
            int i = 1;
            while (i < list.size() && list.get(i).getValue() == mostFrequency) {
                topFrequencyList.add(list.get(i).getKey());
                i++;
            }

            int[] result = new int[topFrequencyList.size()];
            for (int j = 0; j < topFrequencyList.size(); j++) {
                result[j] = topFrequencyList.get(j);
            }

            return result;
        }

        private int postOrder(TreeNode root, Map<TreeNode, Integer> map) {
            int left = 0;
            int right = 0;
            if (root.left != null) {
                left = postOrder(root.left, map);
            }
            if (root.right != null) {
                right = postOrder(root.right, map);
            }
            if (root.left == null && root.right == null) {
                map.put(root, root.val);
                return root.val;
            }
            int sum = left + right + root.val;
            map.put(root, sum);
            return sum;
        }
    }

    public static class Solution2 {
        //my 2nd purely original but verbose solution
        public int[] findFrequentTreeSum(TreeNode root) {
            Map<Integer, Integer> map = new HashMap<>();
            dfs(root, map);
            List<Map.Entry<Integer, Integer>> entryList = new ArrayList<>(map.entrySet());
            Collections.sort(entryList, (a, b) -> b.getValue() - a.getValue());
            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < entryList.size(); i++) {
                if (list.size() == 0) {
                    list.add(entryList.get(i).getKey());
                } else {
                    if (map.get(list.get(0)) == entryList.get(i).getValue()) {
                        list.add(entryList.get(i).getKey());
                    } else {
                        break;
                    }
                }
            }
            int[] result = new int[list.size()];
            for (int i = 0; i < list.size(); i++) {
                result[i] = list.get(i);
            }
            return result;
        }

        private int dfs(TreeNode root, Map<Integer, Integer> map) {
            if (root == null) {
                return 0;
            }
            if (root.left == null && root.right == null) {
                map.put(root.val, map.getOrDefault(root.val, 0) + 1);
                return root.val;
            }
            int leftVal = 0;
            if (root.left != null) {
                leftVal = dfs(root.left, map);
            }
            int rightVal = 0;
            if (root.right != null) {
                rightVal = dfs(root.right, map);
            }
            int val = leftVal + rightVal + root.val;
            map.put(val, map.getOrDefault(val, 0) + 1);
            return val;
        }
    }

    //a more concise and space-efficient solution: https://discuss.leetcode.com/topic/77775/verbose-java-solution-postorder-traverse-hashmap-18ms
    //the key difference between the above post and my original solution is that it's using Frequency as the key of the HashMap
}

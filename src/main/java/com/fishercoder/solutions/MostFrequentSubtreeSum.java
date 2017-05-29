package com.fishercoder.solutions;

import com.fishercoder.common.classes.TreeNode;

import java.util.*;

/**
 * Given the root of a tree, you are asked to find the most frequent subtree sum. The subtree sum of a node is defined as the sum of all the node values formed by the subtree rooted at that node (including the node itself). So what is the most frequent subtree sum value? If there is a tie, return all the values with the highest frequency in any order.

 Examples 1
 Input:
    5
  /  \
 2   -3
 return [2, -3, 4], since all the values happen only once, return all of them in any order.

 Examples 2
 Input:

    5
  /  \
 2   -5
 return [2], since 2 happens twice, however -5 only occur once.

 Note: You may assume the sum of values in any subtree is in the range of 32-bit signed integer.
 */
public class MostFrequentSubtreeSum {

    //my purely original but verbose solution
    public int[] findFrequentTreeSum(TreeNode root) {
        if (root == null) return new int[]{};

        Map<TreeNode, Integer> map = new HashMap();
        postOrder(root, map);

        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (Map.Entry entry : map.entrySet()) {
            frequencyMap.put((Integer) entry.getValue(), frequencyMap.getOrDefault(entry.getValue(), 0)+1);
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

    //a more concise and space-efficient solution: https://discuss.leetcode.com/topic/77775/verbose-java-solution-postorder-traverse-hashmap-18ms
    //the key difference between the above post and my original solution is that it's using Frequency as the key of the HashMap
}

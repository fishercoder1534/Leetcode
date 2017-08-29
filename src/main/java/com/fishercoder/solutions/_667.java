package com.fishercoder.solutions;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * 667. Beautiful Arrangement II
 *
 *  Given two integers n and k, you need to construct a list which contains n different positive integers ranging from 1 to n
 *  and obeys the following requirement:
 *  Suppose this list is [a1, a2, a3, ... , an],
 *  then the list [|a1 - a2|, |a2 - a3|, |a3 - a4|, ... , |an-1 - an|] has exactly k distinct integers.
 *  If there are multiple answers, print any of them.

 Example 1:

 Input: n = 3, k = 1
 Output: [1, 2, 3]
 Explanation: The [1, 2, 3] has three different positive integers ranging from 1 to 3, and the [1, 1] has exactly 1 distinct integer: 1.

 Example 2:

 Input: n = 3, k = 2
 Output: [1, 3, 2]
 Explanation: The [1, 3, 2] has three different positive integers ranging from 1 to 3, and the [2, 1] has exactly 2 distinct integers: 1 and 2.

 Note:

 The n and k are in the range 1 <= k < n <= 104.
 */

public class _667 {

	public static class Solutoin1 {
		/**This brute force solution will result in TLE as soon as n = 10 and k = 4.*/
		public int[] constructArray(int n, int k) {
			List<List<Integer>> allPermutaions = findAllPermutations(n);
			int[] result = new int[n];
			for (List<Integer> perm : allPermutaions) {
				if (isBeautifulArrangement(perm, k)) {
					convertListToArray(result, perm);
					break;
				}
			}
			return result;
		}

		private void convertListToArray(int[] result, List<Integer> perm) {
			for (int i = 0; i < perm.size(); i++) {
				result[i] = perm.get(i);
			}
		}

		private boolean isBeautifulArrangement(List<Integer> perm, int k) {
			Set<Integer> diff = new HashSet<>();
			for (int i = 0; i < perm.size() - 1; i++) {
				diff.add(Math.abs(perm.get(i) - perm.get(i + 1)));
			}
			return diff.size() == k;
		}

		private List<List<Integer>> findAllPermutations(int n) {
			List<List<Integer>> result = new ArrayList<>();
			backtracking(new ArrayList<>(), result, n);
			return result;
		}

		private void backtracking(List<Integer> list, List<List<Integer>> result, int n) {
			if (list.size() == n) {
				result.add(new ArrayList<>(list));
				return;
			}
			for (int i = 1; i <= n; i++) {
				if (list.contains(i)) {
					continue;
				}
				list.add(i);
				backtracking(list, result, n);
				list.remove(list.size() - 1);
			}
		}
	}

	public static class Solutoin2 {
		/**This is a very smart solution:
		 * First, we can see that the max value k could reach is n-1 which
		 * comes from a sequence like this:
		 * when n = 8, k = 5, one possible sequence is:
		 * 1, 8, 2, 7, 3, 4, 5, 6
		 * absolute diffs are:
		 *  7, 6, 5, 4, 1, 1, 1
		 *  so, there are total 5 distinct integers.
		 *
		 *  So, we can just form such a sequence by putting the first part first and
		 *  decrement k along the way, when k becomes 1, we just put the rest numbers in order.*/
		public int[] constructArray(int n, int k) {
			int[] result = new int[n];
			int left = 1;
			int right = n;
			for (int i = 0; i < n && left <= right; i++) {
				if (k > 1) {
					result[i] = k-- % 2 != 0 ? left++ : right--;
				} else {
					result[i] = k % 2 != 0 ? left++ : right--;
				}
			}
			return result;
		}
	}
}

package com.fishercoder.solutions;

/**
 * 278. First Bad Version
 *
 * You are a product manager and currently leading a team to develop a new product.
 * Unfortunately, the latest version of your product fails the quality check.
 * Since each version is developed based on the previous version, all the versions after a bad version are also bad.
 * Suppose you have n versions [1, 2, ..., n] and you want to find out the first bad one,
 * which causes all the following ones to be bad.
 *
 * You are given an API bool isBadVersion(version) which will return whether version is bad.
 * Implement a function to find the first bad version. You should minimize the number of calls to the API.*/
public class _278 {

	public static class Solution1 {
		public int firstBadVersion(int n) {
			int left = 1;
			int right = n;
			if (isBadVersion(left)) {
				return left;
			}

			while (left + 1 < right) {
				int mid = left + (right - left) / 2;
				if (isBadVersion(mid)) {
					right = mid;
				} else {
					left = mid;
				}
			}

			if (isBadVersion(left)) {
				return left;
			}
			return right;
		}

		private boolean isBadVersion(int left) {
			//this is a fake method to make Eclipse happy
			return false;
		}
	}
}

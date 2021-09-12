from fractions import *
from collections import Counter

class Solution:
    #credit: https://leetcode-cn.com/u/lucifer1004/
    def interchangeableRectangles(self, rectangles: List[List[int]]) -> int:
        cnt = Counter()
        for w, h in rectangles:
            cnt[Fraction(w, h)] += 1
        ans = 0
        for value in cnt.values():
            ans += value * (value - 1) // 2
        return ans
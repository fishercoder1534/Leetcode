package com.fishercoder.solutions;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * 1386. Cinema Seat Allocation
 *
 * A cinema has n rows of seats, numbered from 1 to n and there are ten seats in each row, labelled from 1 to 10 as shown in the figure above.
 * Given the array reservedSeats containing the numbers of seats already reserved, for example, reservedSeats[i]=[3,8] means the seat located in row 3 and labelled with 8 is already reserved.
 * Return the maximum number of four-person families you can allocate on the cinema seats. A four-person family occupies fours seats in one row, that are next to each other.
 * Seats across an aisle (such as [3,3] and [3,4]) are not considered to be next to each other, however, It is permissible for the four-person family to be separated by an aisle, but in that case, exactly two people have to sit on each side of the aisle.
 *
 * Example 1:
 * Input: n = 3, reservedSeats = [[1,2],[1,3],[1,8],[2,6],[3,1],[3,10]]
 * Output: 4
 * Explanation: The figure above shows the optimal allocation for four families, where seats mark with blue are already reserved and contiguous seats mark with orange are for one family.
 *
 * Example 2:
 * Input: n = 2, reservedSeats = [[2,1],[1,8],[2,6]]
 * Output: 2
 *
 * Example 3:
 * Input: n = 4, reservedSeats = [[4,3],[1,4],[4,6],[1,7]]
 * Output: 4
 *
 * Constraints:
 * 1 <= n <= 10^9
 * 1 <= reservedSeats.length <= min(10*n, 10^4)
 * reservedSeats[i].length == 2
 * 1 <= reservedSeats[i][0] <= n
 * 1 <= reservedSeats[i][1] <= 10
 * All reservedSeats[i] are distinct.
 * */
public class _1386 {
    public static class Solution1 {
        public int maxNumberOfFamilies(int n, int[][] reservedSeats) {
            Map<Integer, Set<Integer>> map = new HashMap<>();
            for (int[] seat : reservedSeats) {
                if (!map.containsKey(seat[0])) {
                    map.put(seat[0], new HashSet<>());
                }
                map.get(seat[0]).add(seat[1]);
            }
            int count = (n - map.size()) * 2;
            for (int key : map.keySet()) {
                Set<Integer> reservedOnes = map.get(key);
                if (reservedOnes.size() > 6) {
                    continue;
                }
                if (!reservedOnes.contains(2) && !reservedOnes.contains(3) && !reservedOnes.contains(4) && !reservedOnes.contains(5) && !reservedOnes.contains(6) && !reservedOnes.contains(7) && !reservedOnes.contains(8) && !reservedOnes.contains(9)) {
                    count += 2;
                } else if (!reservedOnes.contains(4) && !reservedOnes.contains(5) && !reservedOnes.contains(6) && !reservedOnes.contains(7)) {
                    count++;
                } else if (!reservedOnes.contains(2) && !reservedOnes.contains(3) && !reservedOnes.contains(4) && !reservedOnes.contains(5)) {
                    count++;
                } else if (!reservedOnes.contains(6) && !reservedOnes.contains(7) && !reservedOnes.contains(8) && !reservedOnes.contains(9)) {
                    count++;
                }
            }
            return count;
        }
    }
}

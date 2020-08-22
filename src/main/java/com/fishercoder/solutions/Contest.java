package com.fishercoder.solutions;

import com.fishercoder.common.utils.CommonUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Contest {

    public List<Integer> findSmallestSetOfVertices(int n, List<List<Integer>> edges) {
        List<Integer> starts = new ArrayList<>();
        Map<Integer, Set<Integer>> indegree = new HashMap<>();
        for (int i = 0; i < edges.size(); i++) {
            int end = edges.get(i).get(1);
            if (!indegree.containsKey(end)) {
                indegree.put(end, new HashSet<>());
            }
            indegree.get(end).add(edges.get(i).get(0));
        }
        for (int i = 0; i < n; i++) {
            if (!indegree.containsKey(i)) {
                starts.add(i);
            }
        }
        return starts;
    }

    public int minOperations(int[] nums) {
        Arrays.sort(nums);
        int ops = 0;
        while (!allZero(nums)) {
            if (allEvenAndNonZeroes(nums)) {
                nums = half(nums);
                ops++;
            } else if (hasOdds(nums)) {
                int[] result = new int[nums.length];
                for (int i  = 0; i < nums.length; i++) {
                    if (nums[i] % 2 != 0) {
                        result[i] = nums[i] - 1;
                        ops++;
                    } else {
                        result[i] = nums[i];
                    }
                }
                nums = result;
            } else {
                int[] result = new int[nums.length];
                for (int i = 0; i < nums.length; i++) {
                    if (nums[i] != 0) {
                        result[i] = nums[i] / 2;
                    } else {
                        result[i] = nums[i];
                    }
                }
                nums = result;
                ops++;
            }
        }
        return ops;
    }

    private boolean hasOdds(int[] nums) {
        for (int i : nums) {
            if (i % 2 != 0) {
                return true;
            }
        }
        return false;
    }

    private int[] half(int[] nums) {
        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            result[i] = nums[i] / 2;
        }
        return result;
    }

    private boolean allEvenAndNonZeroes(int[] nums) {
        for (int i : nums) {
            if (i % 2 != 0 || i == 0) {
                return false;
            }
        }
        return true;
    }

    private boolean allZero(int[] nums) {
        for (int i : nums) {
            if (i != 0) {
                return false;
            }
        }
        return true;
    }

    public boolean containsCycle(char[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                boolean[][] visited = new boolean[m][n];
                visited[i][j] = true;
                if (dfs(i, j, grid, grid[i][j], visited, i, j)) {
                    return true;
                }
            }
        }
        return false;
    }

    int[] directions = new int[]{0, 1, 0, -1, 0};
    private boolean dfs(int i, int j, char[][] grid, char c, boolean[][] visited, int startI, int startJ) {
        for (int row = 0; row < directions.length - 1; row++) {
            int nextI = i + directions[row];
            int nextJ = j + directions[row + 1];
            if (nextI >= 0 && nextI < grid.length && nextJ >= 0 && nextJ < grid[0].length && grid[nextI][nextJ] == c) {
                if (nextI == startI && nextJ == startJ) {
                    return true;
                } else if (visited[nextI][nextJ]) {
                    continue;
                }
                visited[nextI][nextJ] = true;
                dfs(nextI, nextJ, grid, c, visited, startI, startJ);
                visited[nextI][nextJ] = false;
            }
        }
        return false;
    }

    public static void main(String... args) {
        System.out.println("hello world!");
        Contest contest = new Contest();
//        System.out.println(contest.thousandSeparator(1234));
//        System.out.println(contest.thousandSeparator(0));
//        System.out.println(contest.thousandSeparator(123456789));
//        System.out.println(contest.thousandSeparator(987));

//        System.out.println(contest.findSmallestSetOfVertices(6, Arrays.asList(Arrays.asList(0, 1), Arrays.asList(0, 2), Arrays.asList(2, 5), Arrays.asList(3, 4), Arrays.asList(4, 2))));
//        System.out.println(contest.findSmallestSetOfVertices(5, Arrays.asList(Arrays.asList(0, 1), Arrays.asList(2, 1), Arrays.asList(3, 1), Arrays.asList(1, 4), Arrays.asList(2, 4))));

//        System.out.println(contest.minOperations(new int[]{1, 5}));//5
//        System.out.println(contest.minOperations(new int[]{2, 2}));//3
//        System.out.println(contest.minOperations(new int[]{4, 2, 5}));//6
//        System.out.println(contest.minOperations(new int[]{3, 2, 2, 4}));//7
//        System.out.println(contest.minOperations(new int[]{2, 4, 8, 16}));//8

        System.out.println(contest.containsCycle(new char[][]{{'a','a','a','a'}, {'a','b','b','a'}, {'a','b','b','a'}, {'a','a','a','a'}}));
        System.out.println("finished.");
    }
}

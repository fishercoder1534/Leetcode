package com.fishercoder.solutions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.TreeMap;
/**
 * 218. The Skyline Problem
 *
 * A city's skyline is the outer contour of the silhouette formed by all the buildings in that city when viewed from a distance.
 * Now suppose you are given the locations and height of all the buildings as shown on a cityscape photo (Figure A),
 * write a program to output the skyline formed by these buildings collectively (Figure B).
 *
 * The geometric information of each building is represented by a triplet of integers [Li, Ri, Hi],
 * where Li and Ri are the x coordinates of the left and right edge of the ith building, respectively,
 * and Hi is its height. It is guaranteed that 0 ≤ Li, Ri ≤ INT_MAX, 0 < Hi ≤ INT_MAX, and Ri - Li > 0.
 * You may assume all buildings are perfect rectangles grounded on an absolutely flat surface at height 0.
 *
 * For instance, the dimensions of all buildings in Figure A are recorded as: [ [2 9 10], [3 7 15], [5 12 12], [15 20 10], [19 24 8] ] .
 * The output is a list of "key points" (red dots in Figure B) in the format of [ [x1,y1], [x2, y2], [x3, y3], ... ]
 * that uniquely defines a skyline.
 * A key point is the left endpoint of a horizontal line segment.
 * Note that the last key point, where the rightmost building ends,
 * is merely used to mark the termination of the skyline, and always has zero height.
 * Also, the ground in between any two adjacent buildings should be considered part of the skyline contour.

 For instance, the skyline in Figure B should be represented as:[ [2 10], [3 15], [7 12], [12 0], [15 10], [20 8], [24, 0] ].

 Notes:

 The number of buildings in any input list is guaranteed to be in the range [0, 10000].
 The input list is already sorted in ascending order by the left x position Li.
 The output list must be sorted by the x position.
 There must be no consecutive horizontal lines of equal height in the output skyline. For instance, [...[2 3], [4 5], [7 5], [11 5], [12 7]...] is not acceptable; the three lines of height 5 should be merged into one in the final output as such: [...[2 3], [4 5], [12 7], ...]*/

/**This video is super clear and helpful: https://www.youtube.com/watch?v=GSBLe8cKu0s

 Algorithm:
First observation: all the points in the final result come from the four angles that each building has
Scan through the horizontal lines
Use a PriorityQueue to hold each building, and make the PriorityQueue to sort on the height of the buildings
whenever we encounter the start of a building, we push it into the PriorityQueue, whenever we finished scanning that building, we remove it from the PriorityQueue
Also, in the scan process, we’ll keep updating the maxHeight in the PriorityQueue if we find a new maxHeight which means the building will be overshadowed by the new higher one
 
Three edge cases (see the graph illustration in the above video at 12’18”):
when two buildings have the same start point, the one with higher height shows up in the final result
when two buildings have the same end point, the one with higher height shows up in the final result
when the start point of one building is is also the end point of another building, the one with higher height shows up in the final result

 We use TreeMap over a normal PriorityQueue:
For the sake of efficiency (better time complexity), we’ll use TreeMap which supports O(logn) for remove() operation,
 this is the reason we choose TreeMap over a normal PriorityQueue in Java (PriorityQueue supports add() and getMaxVal() in both O(logn) time, however, for remove(), it does NOT.)
But TreeMap in Java supports all the three operations in O(logn) time.*/

public class _218 {

    public static class Solution1 {

        class BuildingPoint implements Comparable<BuildingPoint> {
            int x;
            boolean isStart;
            int h;

            public BuildingPoint(int x, boolean isStart, int h) {
                this.x = x;
                this.h = h;
                this.isStart = isStart;
            }

            @Override
            public int compareTo(BuildingPoint o) {
                if (this.x != o.x) {
                    return this.x - o.x;
                } else {
                    if (this.isStart && o.isStart) {
                        return o.h - this.h;
                    } else if (this.isStart && !o.isStart) {
                        return -this.h - o.h;
                    } else if (!this.isStart && !o.isStart) {
                        return this.h - o.h;
                    } else {
                        return this.h + o.h;
                    }
                }
            }
        }

        public List<int[]> getSkyline(int[][] buildings) {
            BuildingPoint[] bps = new BuildingPoint[buildings.length * 2];
            int index = 0;
            for (int[] building : buildings) {
                BuildingPoint bp1 = new BuildingPoint(building[0], true, building[2]);
                BuildingPoint bp2 = new BuildingPoint(building[1], false, building[2]);
                bps[index++] = bp1;
                bps[index++] = bp2;
            }

            //this is one key step:
            Arrays.sort(bps);

            List<int[]> result = new ArrayList();
            TreeMap<Integer, Integer> treeMap = new TreeMap();
            treeMap.put(0, 1);
            int prevMaxH = 0;
            for (BuildingPoint bp : bps) {
                //if it's a starting point, we'll add it into the final result
                if (bp.isStart) {
                    if (treeMap.containsKey(bp.h)) {
                        treeMap.put(bp.h, treeMap.get(bp.h) + 1);
                    } else {
                        treeMap.put(bp.h, 1);
                    }
                } else if (!bp.isStart) {
                    //if it's an ending point, we'll decrement/remove this entry
                    if (treeMap.containsKey(bp.h) && treeMap.get(bp.h) > 1) {
                        treeMap.put(bp.h, treeMap.get(bp.h) - 1);
                    } else {
                        treeMap.remove(bp.h);
                    }
                }

                int currMaxH = treeMap.lastKey();
                if (currMaxH != prevMaxH) {
                    result.add(new int[]{bp.x, currMaxH});
                    prevMaxH = currMaxH;
                }

            }

            return result;
        }
    }
}

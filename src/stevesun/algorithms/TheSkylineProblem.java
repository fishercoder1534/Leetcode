package stevesun.algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.TreeMap;
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
For the sake of efficiency (better time complexity), we’ll use TreeMap which supports O(logn) for remove() operation, this is the reason we choose TreeMap over a normal PriorityQueue in Java (PriorityQueue supports add() and getMaxVal() in both O(logn) time, however, for remove(), it does NOT.)
But TreeMap in Java supports all the three operations in O(logn) time.*/

public class TheSkylineProblem {

    class BuildingPoint implements Comparable<BuildingPoint>{
        int x;
        boolean isStart;
        int h;
        
        public BuildingPoint(int x, boolean isStart, int h){
            this.x = x;
            this.h = h;
            this.isStart = isStart;
        }
        
        @Override
        public int compareTo(BuildingPoint o){
            if(this.x != o.x){
                return this.x - o.x;
            } else {
                if(this.isStart && o.isStart){
                    return  o.h - this.h;
                } else if(this.isStart && !o.isStart){
                    return -this.h - o.h;
                } else if(!this.isStart && !o.isStart){
                    return this.h - o.h;
                } else {
                    return this.h + o.h;
                }
            }
        }
    }
    
    public List<int[]> getSkyline(int[][] buildings) {
        BuildingPoint[] bps = new BuildingPoint[buildings.length*2];
        int index = 0;
        for(int[] building : buildings){
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
        for(BuildingPoint bp : bps){
            //if it's a starting point, we'll add it into the final result
            if(bp.isStart){
                if(treeMap.containsKey(bp.h)) treeMap.put(bp.h, treeMap.get(bp.h)+1);
                else treeMap.put(bp.h, 1);
            }
            
            //if it's an ending point, we'll decrement/remove this entry
            else if(!bp.isStart){
                if(treeMap.containsKey(bp.h) && treeMap.get(bp.h) > 1) treeMap.put(bp.h, treeMap.get(bp.h)-1);
                else treeMap.remove(bp.h);
            }
            
            int currMaxH = treeMap.lastKey();
            if(currMaxH != prevMaxH){
                result.add(new int[]{bp.x, currMaxH});
                prevMaxH = currMaxH;                
            }
            
        }
        
        return result;
    }

}

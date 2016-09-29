package hard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.TreeMap;

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

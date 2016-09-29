package medium;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class CourseScheduleII {

    public int[] findOrder(int numCourses, int[][] prerequisites) {
        int[] degree = new int[numCourses];
        for(int[] course : prerequisites){
            degree[course[0]]++;
        }
        
        Set<Integer> zeroDegree = new HashSet();
        Queue<Integer> q = new LinkedList();
        for(int i = 0; i < numCourses; i++){
            if(degree[i] == 0) {
                zeroDegree.add(i);
                q.offer(i);
            }
        }
        
        if(zeroDegree.isEmpty()) return new int[0];
        
        while(!zeroDegree.isEmpty()){
            Iterator<Integer> it = zeroDegree.iterator();
            int course = it.next();
            zeroDegree.remove(course);
            for(int[] pre : prerequisites){
                if(course == pre[1]){
                    degree[pre[0]]--;
                    if(degree[pre[0]] == 0){
                        zeroDegree.add(pre[0]);
                        q.offer(pre[0]);
                    }
                }
            }
        }
        
        for(int i = 0; i < numCourses; i++){
            if(degree[i] != 0) return new int[0];
        }
        
        int[] result = new int[q.size()];
        int i = 0;
        while(!q.isEmpty()){
            result[i++] = q.poll();
        }
        return result;
    }

}

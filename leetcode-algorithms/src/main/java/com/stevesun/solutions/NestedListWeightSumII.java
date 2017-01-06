package com.stevesun.solutions;
import com.stevesun.common.classes.NestedInteger;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class NestedListWeightSumII {

    public int depthSumInverse(List<NestedInteger> nestedList) {
        Queue<NestedInteger> q = new LinkedList<NestedInteger>();
        for(NestedInteger next : nestedList){
            q.offer(next);
        }
        int prev = 0, total = 0;
        
        while(!q.isEmpty()){
            int size = q.size();
            int levelSum = 0;
            for(int i = 0; i < size; i++){
                NestedInteger next = q.poll();
                if(next.isInteger()) levelSum += next.getInteger();
                else{
                    List<NestedInteger> list = next.getList();
                    for(NestedInteger n : list){
                        q.offer(n);
                    }
                }
            }
            prev += levelSum;
            total += prev;
        }
        return total;
    }

}

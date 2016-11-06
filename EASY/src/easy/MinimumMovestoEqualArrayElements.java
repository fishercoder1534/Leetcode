package easy;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class MinimumMovestoEqualArrayElements {

    public static int minMoves(int[] nums) {
        Queue<Integer> heap = new PriorityQueue<Integer>(new Comparator<Integer>(){
            @Override
            public int compare(Integer o1, Integer o2) {
                if(o1 > o2) return 1;
                else if(o1 < o2) return -1;
                else return 0;
            }
        });//in ascending order
        
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < nums.length; i++){
            max = Math.max(max, nums[i]);
            heap.offer(nums[i]);
        }
        
        int moves = 0;
        while(!heap.isEmpty()){
            //always increments two elements
            int one = heap.poll();
            int two = heap.poll();
            one++;
            two++;
            moves++;
            max = Math.max(max, Math.max(one, two)); 
            heap.offer(one);
            heap.offer(two);
            if(heap.peek() == max) break;
        }
        return moves;
    }
    
    public static void main(String...args){
        int[] nums = new int[]{1,2,3};
        System.out.println(minMoves(nums));
    }

}

package stevesun.algorithms;

import stevesun.common.classes.ListNode;

import java.util.Comparator;
import java.util.PriorityQueue;

/**As discussed with 司德君,王昊,薛博, this is super easy as long as you can think of heap, offer each of the head node into the min-heap.*/

public class MergeKSortedList {
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<ListNode> heap = new PriorityQueue(new Comparator<ListNode>(){
            @Override
            public int compare(ListNode o1, ListNode o2) {
                return o1.val - o2.val;
            }
        });
        
        for(ListNode node : lists){
            if(node != null) heap.offer(node);
        }
        
        ListNode pre = new ListNode(-1);
        ListNode temp = pre;
        while(!heap.isEmpty()){
            ListNode curr = heap.poll();
            temp.next = curr;
            temp = temp.next;
            if(curr.next != null) heap.offer(curr.next);
        }
        return pre.next;
    }
}

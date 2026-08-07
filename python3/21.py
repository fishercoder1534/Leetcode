
# https://leetcode.com/problems/merge-two-sorted-lists/
# Iterative solution
class Solution:
    def mergeTwoLists(self, l1: Optional[ListNode], l2: Optional[ListNode]) -> Optional[ListNode]:
        tempHead = ListNode() # Empty node to be head of merged list
        temp = tempHead # End node of merged list, append new nodes to end of temp
        
        # While BOTH l1 and l2 still have nodes
        while (l1 is not None and l2 is not None):
            # If current node of l1 has a smaller value than current node of l2
            if (l1.val < l2.val):
                # Append l1 node to merged list
                temp.next = l1
                # Go to next l1 node
                l1 = l1.next
            else:
                temp.next = l2
                l2 = l2.next
            
            # Go to new end of merged list
            temp = temp.next
        
        # Either l1, l2, or neither have nodes left
        # Can directly append all of the remaining nodes to merged list
        temp.next = l1 if l1 is not None else l2
        
        # tempHead is empty node, return the actual head node of merged list
        return tempHead.next


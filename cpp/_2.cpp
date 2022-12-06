/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode() : val(0), next(nullptr) {}
 *     ListNode(int x) : val(x), next(nullptr) {}
 *     ListNode(int x, ListNode *next) : val(x), next(next) {}
 * };
 */
class Solution {
public:
    ListNode* addTwoNumbers(ListNode* l1, ListNode* l2) {
        int carry =0;
        ListNode* head = NULL;
        ListNode* last = NULL;
        while(l1&&l2){
            int temp = l1->val+l2->val+carry;
            ListNode* cur = new ListNode(temp%10);
            carry = temp/10;
            if(head == NULL){
                head = cur;
                last = cur;
            }else{
                last->next = cur;
                last = cur;
            }
            l1=l1->next;
            l2=l2->next;
        }
        while(l1){
            int temp = l1->val+carry;
            ListNode* cur = new ListNode(temp%10);
            carry = temp/10;
            if(head == NULL){
                head = cur;
                last = cur;
            }else{
                last->next = cur;
                last = cur;
            }
            l1=l1->next;
        }
        while(l2){
            int temp = l2->val+carry;
            ListNode* cur = new ListNode(temp%10);
            carry = temp/10;
            if(head == NULL){
                head = cur;
                last = cur;
            }else{
                last->next = cur;
                last = cur;
            }
            l2=l2->next;
        }
        if(carry){
            ListNode* cur = new ListNode(carry);
            last->next = cur;
            cur->next= NULL;
        }
        return head;
    }
};
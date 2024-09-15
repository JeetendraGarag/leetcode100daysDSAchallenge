/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public int sizell(ListNode head){
        int counter =0;
        ListNode ptr=head;
        while(ptr!=null){
         counter++;
         ptr=ptr.next;
        }
        return counter;
    }
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA==null || headB==null){
            return null;
        }
        int size1=sizell(headA);
        int size2=sizell(headB);
        ListNode ptr1=headA;
        ListNode ptr2=headB;
        int diff=size1-size2;
        if(diff>0){
            while(diff>0){
                ptr1=ptr1.next;
                diff--;
            }
        }else{
            while(diff<0){
                ptr2=ptr2.next;
                diff++;
            }
        }
        while(ptr1!=ptr2){
            ptr1=ptr1.next;
            ptr2=ptr2.next;
        }
        return ptr1;
    }
}
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeNodes(ListNode head) {
       ListNode dummy = new ListNode(-1);
       ListNode ans= dummy;
       ListNode Cur=head.next;
       int sum=0;
       while(Cur != null){
        if(Cur.val!=0){
            sum+=Cur.val;
        }else{
            ListNode temp = new ListNode(sum);
            dummy.next = temp;
            dummy = dummy.next;
            sum=0;
        }
        Cur=Cur.next;
       } 
       return ans.next;
    }
}
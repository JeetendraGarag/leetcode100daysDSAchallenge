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
    public boolean isPalindrome(ListNode head) {

        Stack<Integer> st = new Stack<>();
        ListNode ptr=head;
        while(ptr!=null){
            st.push(ptr.val);
            ptr=ptr.next;

        }
        ListNode ptr2=head;
        while(ptr2!=null){
            int val= ptr2.val;
            int val1=st.pop();
            if(val!=val1){
              return false;
            }
            ptr2=ptr2.next;
        }
      return true;

    }

}
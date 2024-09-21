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
    public int sizell(ListNode head){
        ListNode cur= head;
        int count=0;
        while(cur!=null){
            count++;
            cur=cur.next;
        }
        return count;
    }
    public ListNode reversell(ListNode head){
        ListNode cur= head;
        ListNode pre=null;
        while(cur!=null){
            ListNode temp=  cur.next;
            cur.next=pre;
            pre=cur;
            cur=temp;
        }
        return pre;
    }
    public int[] nextLargerNodes(ListNode head) {
        int size = sizell(head);
        int[] arr= new int [size];
        ListNode nhead= reversell(head);

        Stack <Integer> st = new Stack<>();
        st.push(nhead.val);
        ListNode cur= nhead.next;
         int ptr=size-2;

         while(ptr>=0){
            int ele=cur.val;
            cur=cur.next;

            while(st.size()>0 && st.peek()<=ele){
                st.pop();
            }
            if(st.size()==0){
                arr[ptr]=0;
            }else{
                arr[ptr]=st.peek();
            }
            st.push(ele);
            ptr--;
         }
         return arr;
    }
}
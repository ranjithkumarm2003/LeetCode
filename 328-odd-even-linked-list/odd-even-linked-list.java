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
    public ListNode oddEvenList(ListNode head) {
        if(head==null || head.next==null) return head;
        ListNode o=head;
        ListNode e=head.next;
        ListNode odd=o;
        ListNode even=e;
        while(true){
            boolean oFlag=false;
            boolean eFlag=false;
            if(odd.next!=null && odd.next.next!=null){
                odd.next=odd.next.next;
                odd=odd.next;
                oFlag=true;
            }
             if(even.next!=null && even.next.next!=null){
                even.next=even.next.next;
                even=even.next;
                eFlag=true;
            }
            if(!oFlag && !eFlag){
                break;
            }
        }
        even.next=null;
        odd.next=e;
        return o;
    }
}
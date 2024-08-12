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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(head==null){
            return null;
        }
        ListNode dummy=new ListNode(-1);
        dummy.next=head;
        ListNode first=dummy;
        for(int i=1;i<left;i++){
            first=first.next;
        }
        ListNode temp1=first.next;
        ListNode temp2=temp1.next;
        for(int i=1;i<=right-left;i++){
            temp1.next=temp2.next;
            temp2.next=first.next;
            first.next=temp2;
            temp2=temp1.next;
        }
        return dummy.next;
    }
}
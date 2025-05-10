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
    public ListNode removeElements(ListNode head, int val) {
        if(head==null) return null;
        ListNode dummy=new ListNode(-1);
        ListNode curr=dummy;

        while(head!=null){
            if(head.val==val){
                head=head.next;
                continue;
            }
            curr.next=head;
            head=head.next;
            curr=curr.next;
        }
        curr.next=null;
        return dummy.next;

    }
}
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
        if(head==null){
            return head;
        }
        
        ListNode pre=new ListNode(-1);
        ListNode ans=pre;
        while(head!=null){
            if(head.next==null && head.val==val){
                pre.next=null;
            }
            if(head.val!=val){
              pre.next=head;
              pre=pre.next;
              head=head.next;
            }
            else{
                head=head.next;
            }
        
        }
        return ans.next;
    }
}
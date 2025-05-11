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
    public ListNode removeNthFromEnd(ListNode head, int n) {
     if(n==1){
        ListNode temp=Reverse(head);
        temp=temp.next;
        return Reverse(temp);
     }
      ListNode rev=Reverse(head);
      ListNode cur=rev;
      for(int i=1;i<n;i++){
        if(i==n-1){
            rev.next=rev.next.next;
            return Reverse(cur);
        }
        rev=rev.next;
      }
     return rev;
    }
    public ListNode Reverse(ListNode head){
        ListNode r,q=null;
        while(head!=null){
            r=q;
            q=head;
            head=head.next;
            q.next=r;
        }
       return q;

    }
}
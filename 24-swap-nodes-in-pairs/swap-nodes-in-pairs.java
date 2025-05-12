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
    public ListNode swapPairs(ListNode head) {
        if(head==null || head.next==null) return head;
       ListNode dummy=new ListNode(-1);
       ListNode cur=dummy;
       ListNode l=head,r=head.next;
       while(true){
        cur.next=r;
        ListNode temp=r.next;
        r.next=l;
        cur=cur.next.next;
        if(temp!=null && temp.next!=null){
            l=temp;
            r=temp.next;
        }
        else if(temp!=null && temp.next==null){
            cur.next=temp;
            break;
        }
        else{
            cur.next=null;
            break;
        }

       }
       return dummy.next;
    }
}
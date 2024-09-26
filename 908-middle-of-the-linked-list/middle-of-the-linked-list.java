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
    public ListNode middleNode(ListNode head) {
        int c=1;
       ListNode mid=head;
       while(head.next!=null){
        head=head.next;
        c++;
        if(c%2==0){
            mid=mid.next;
        }
       }
        return mid;
    }
}
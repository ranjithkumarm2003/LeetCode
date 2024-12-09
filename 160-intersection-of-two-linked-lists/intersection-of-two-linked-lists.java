/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
         ListNode B=headB;
         ListNode A=headA;
        while(A!=B){
            A=(A==null)? headB : A.next;
            B=(B==null)? headA : B.next; 
        }
        return B;
    }
}
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
        while(headA!=null){
          
            while(headB!=null){
                if(headA==headB){
                    return headA;
                }
                if(headB.next==null){
                    break;
                }
                headB=headB.next;
            }
            headB=B;
            if(headA.next==null){
                break;
            }
            headA=headA.next;
        }
        return null;
    }
}
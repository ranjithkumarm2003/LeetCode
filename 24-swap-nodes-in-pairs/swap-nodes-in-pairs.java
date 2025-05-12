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
        // Base case
        if (head == null || head.next == null) {
            return head;
        }
        
        // Conditional case
        ListNode second = head.next;
        
        head.next = swapPairs(second.next);
        second.next = head;
        
        return second;
    }
}
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
    public ListNode reverseList(ListNode head) {
        if (head == null) {
            return head;
        }
        
        ListNode first = head;
        ListNode sec = head.next;
        
        while (sec != null) {
            ListNode temp = sec.next; 
            sec.next = first;         
            first = sec;              
            sec = temp;               
        }
        
        head.next = null; 
        return first;     
    }
}

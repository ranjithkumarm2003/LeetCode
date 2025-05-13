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

public void reorderList(ListNode head) {
    if (head == null || head.next == null || head.next.next == null)
        return;
    reorder(head, head.next.next);
}

ListNode reorder(ListNode curr, ListNode fast) {
    if (fast == null) {
        ListNode toMove = curr.next;
        curr.next = null;
        return toMove;
    }
    // 1 2 3 4
    // 1,3 2,null -> 4

    // 1,3 2,5 3,null -> 4
    // 1 5 2 4 3
    ListNode toInsert;
    if (fast.next == null) {
        toInsert = reorder(curr.next, null);
    } else {
        if (fast.next.next == null) {
            toInsert = reorderEven(curr.next);
        } else {
            toInsert = reorder(curr.next, fast.next.next);
        }
    }
    ListNode toMove = toInsert.next;
    ListNode next = curr.next;
    curr.next = toInsert;
    toInsert.next = next;
    return toMove;
}

private ListNode reorderEven(ListNode node) {
    ListNode toMove = node.next.next;
    node.next.next = null;
    return toMove;
}}
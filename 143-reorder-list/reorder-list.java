class Solution {
    public void reorderList(ListNode head) {
        if (head == null || head.next == null) {
            return;
        }
        ListNode fir = head;
        ListNode sec = head.next;
        while (sec.next != null) {
            ListNode pre = head;
            ListNode cur = head.next;
            while (cur.next != null) {
                pre = pre.next;
                cur = cur.next;
            }
            fir.next = cur;
            cur.next = sec;
            pre.next = null;
            fir = fir.next.next;
            sec=fir.next;
            if (fir.next== null) {
                break;
            }
        }
    }
}

class Solution {

    public int getDecimalValue(ListNode head) {
        int num = 0; // To store the decimal value
        
        while (head != null) {
            // Shift current num by 1 (multiply by 2 in binary) and add the current node value
            num = (num << 1) | head.val; 
            head = head.next;
        }
        
        return num; // Return the final decimal value
    }
}

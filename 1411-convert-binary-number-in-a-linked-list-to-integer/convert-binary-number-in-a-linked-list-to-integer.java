import java.math.BigInteger;
class Solution {

    public int getDecimalValue(ListNode head) {
        BigInteger num = BigInteger.ZERO;
        
        // Create the binary number from the linked list
        while (head != null) {
            num = num.multiply(BigInteger.TEN).add(BigInteger.valueOf(head.val));
            head = head.next;
        }

        int ans = 0;
        int i = 0;

        // Convert the binary number to decimal
        while (!num.equals(BigInteger.ZERO)) {
            BigInteger rem = num.mod(BigInteger.TEN);
            if (rem.equals(BigInteger.ONE)) {
                ans += (int) Math.pow(2, i);
            }
            i++;
            num = num.divide(BigInteger.TEN);
        }

        return ans;
    }
}


class Solution {
    public int incremovableSubarrayCount(int[] nums) {
        int n = nums.length;
        int[] pre = new int[n];
        int[] suf = new int[n];

        // Step 1: Compute prefix increasing
        pre[0] = 1;
        for (int i = 1; i < n; i++) {
            pre[i] = (nums[i] > nums[i - 1]) ? pre[i - 1] + 1 : 1;
        }

        // Step 2: Compute suffix increasing
        suf[n - 1] = 1;
        for (int i = n - 2; i >= 0; i--) {
            suf[i] = (nums[i] < nums[i + 1]) ? suf[i + 1] + 1 : 1;
        }

        int count = 0;

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                boolean isValid = true;

                if (i > 0 && j < n - 1) {
                    if (nums[i - 1] >= nums[j + 1]) {
                        isValid = false;
                    }
                }

                if (isValid) {
                    if (i == 0 || pre[i - 1] == i) {
                        if (j == n - 1 || suf[j + 1] == n - j - 1) {
                            count++;
                        }
                    }
                }
            }
        }

        return count;
    }
}

class Solution {
    public void moveZeroes(int[] nums) {
        int k = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[k] == 0 && nums[i] == 0) {
                continue;
            }
            if (nums[i] != 0 && nums[k] == 0) {
                int temp = nums[k];
                nums[k] = nums[i];
                nums[i] = temp;
                
            }
            k++;
        }
    }
}
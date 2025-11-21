class Solution {
    public int maximumGap(int[] nums) {
        Arrays.sort(nums);
        int diff=0;
        for(int i=0;i<nums.length-1;i++){
           diff=Math.max(Math.abs(nums[i]-nums[i+1]),diff);
        }
        return diff;
    }
}
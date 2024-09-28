class Solution {
    public int missingNumber(int[] nums) {
       // if(nums.length==1) return nums[0]-1;
        Arrays.sort(nums);
        int c=0;
        for(int i=0;i<nums.length;i++){
            if(c!=nums[i]){
                return c;
            }
            c++;
        }
        return c;
    }
}
class Solution {
    public int removeDuplicates(int[] nums) {
      int n=nums.length;
      int pre=1;
      for(int i=0;i<n;i++){
        if(nums[pre-1]!=nums[i]){
            nums[pre++]=nums[i];
        }
      }
      return pre;
    }
}
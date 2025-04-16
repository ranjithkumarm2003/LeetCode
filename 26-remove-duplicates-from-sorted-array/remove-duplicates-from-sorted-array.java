class Solution {
    public int removeDuplicates(int[] nums) {
      int n=nums.length;
      int pre=0;
      for(int i=0;i<n;i++){
        if(nums[pre]!=nums[i]){
            nums[++pre]=nums[i];
        }
      }
      return pre+1;
    }
}
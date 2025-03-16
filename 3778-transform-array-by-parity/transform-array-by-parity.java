class Solution {
    public int[] transformArray(int[] nums) {
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0) nums[i]=0;
            else nums[i]=1;
        }
        int i=0;
        int j=nums.length-1;
        while(i<j){
            if(nums[i]==1 && nums[j]==0){
                nums[i]=0;
                nums[j]=1;
                i++;j--;
            }
             if(nums[i]==0) i++;
             if(nums[j]==1) j--; 

        }
        return nums;
    }
}
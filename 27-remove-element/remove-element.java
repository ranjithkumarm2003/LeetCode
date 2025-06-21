class Solution {
    public int removeElement(int[] nums, int val) {
        int i=0;
        int j=nums.length-1;
        while(i<=j){
            if(nums[i]==val && nums[j]!=val){
                nums[i]=nums[i]+nums[j];
                nums[j]=nums[i]-nums[j];
                nums[i]=nums[i]-nums[j];
                i++;j--;
            }
            else if(nums[i]==val && nums[j]==val){
                j--;
            }
            else if(nums[i]!=val && nums[j]!=val){
                i++;
            }
            else{
                i++;j--;
            }
        }
        return i;
    }
}
class Solution {
    public int[] singleNumber(int[] nums) {
        int arr[]=new int[2];
        int k=0;
        for(int i=0;i<nums.length;i++){
            int c=0;
            for(int j=0;j<nums.length;j++){
                 if(i==j){
                    continue;
                 }
                if(nums[i]==nums[j]){
                    c++;
                }
            }
            if(c==0){
                arr[k++]=nums[i];
            }
        }
        return arr;
    }
}
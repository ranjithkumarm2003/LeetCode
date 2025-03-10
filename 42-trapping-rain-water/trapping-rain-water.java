class Solution {
    public int trap(int[] height) {
        int i=0;int j=height.length-1;
        int left=height[i];
        int right=height[j];
        int water=0;
        while(i<j){
             if(left<=right){
                water+=(left-height[i]);
                i++;
                left=Math.max(left,height[i]);
             }
             else{
                water+=(right-height[j]);
                j--;
                right=Math.max(right,height[j]);
             }
        }
        return water;
    }
}
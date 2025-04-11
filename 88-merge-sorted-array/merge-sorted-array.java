class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int c=0;
        for(int i=0;i<nums1.length;i++){
            if(nums1[i]!=0){
                c++;
            }
        }
         for(int i=0;i<nums2.length;i++){
            if(nums2[i]!=0){
                c++;
            }
        }
        int k=0;
        for(int i=0;i<nums1.length;i++){
            if(nums1[i]==0){
                nums1[i]=nums2[k++];
            }
            if(k==n) break;
        }
        Arrays.sort(nums1);

    }
}
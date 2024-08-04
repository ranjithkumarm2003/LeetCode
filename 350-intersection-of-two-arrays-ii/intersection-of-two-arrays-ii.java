class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
         ArrayList<Integer>li=new ArrayList<>();
        for(int i=0;i<nums1.length;i++)
        {
            for(int j=0;j<nums2.length;j++)
            {
                if(nums1[i]==nums2[j])
                {
                    li.add(nums1[i]);
                    nums2[j]=-1;
                    break;
                }
            }
        }
        int arr[]=new int[li.size()];
        for(int i=0;i<arr.length;i++){
            arr[i]=li.get(i);
        }
        return arr;
    }
}
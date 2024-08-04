class Solution {
    public boolean validMountainArray(int[] arr) {
        int c=0;
        int c1=0;
        if(arr.length<3)return false;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]<arr[i+1] && c==0){
                c++;
            }
            else if(arr[i]>arr[i+1] && c==0){
                return false;
            }
            if(arr[i]<arr[i+1] &&c1==0){
                continue;
            }
            else if(arr[i]>arr[i+1]){
                c1++;
            }
            else{
                return  false;
            }
        }
        if(c1==0) return false;
        return true;
    }
}
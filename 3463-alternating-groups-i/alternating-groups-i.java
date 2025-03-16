class Solution {
    public int numberOfAlternatingGroups(int[] arr) {
        int c=0;
        int n=arr.length;
        if((arr[n-1] == arr[1]) && arr[1]!=arr[0]) c++;
        for(int i=1;i<n-1;i++){
            if(arr[i-1]==arr[i+1] && arr[i-1]!=arr[i]){
                c++;
            }
        }
        if((arr[n-2] == arr[0]) && arr[0]!=arr[n-1]) c++;
        return c;
    }
}
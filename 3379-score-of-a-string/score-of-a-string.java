class Solution {
    public int scoreOfString(String s) {
        int arr[]=new int [s.length()];
        for(int i=0;i<s.length();i++){
            int a=(int)s.charAt(i);
            arr[i]=a;
        }
        int sum=0;
        for(int i=0;i<s.length()-1;i++){
            sum=sum+Math.abs(arr[i]-arr[i+1]);
        }
        return sum;
    }
}
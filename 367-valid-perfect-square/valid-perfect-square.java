class Solution {
    public boolean isPerfectSquare(int num) {
        int l = 1;
        int r =num;
        while(l<=r){
        long mid=(l+r)/2;
        long squaredMid=mid*mid;
        if(squaredMid==num){
            return true;
    } else if(squaredMid > num) {
            r =(int)mid-1;
        } else {
             l =(int)mid+1;
        }
        } 
         return false;
        
    }
}
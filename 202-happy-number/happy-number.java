class Solution {
    public boolean isHappy(int n) {
        int sum=0;
        if(n==1){
            return true;
        }
        while(n!=1 && n!=4){
             sum=0;
            while(n>0){
                int rem=n%10;
                sum+=rem*rem;
                n/=10;
            }n=sum;
            
        }
        if(sum==1) return true;
        else return false;
    }
}
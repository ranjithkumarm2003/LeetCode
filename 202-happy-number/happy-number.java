class Solution {
    public boolean isHappy(int n) {
        int num=n;
        while(true){
            int sum=0;
            while(n!=0){
                int rem=n%10;
                sum+=(rem*rem);
                n/=10;
            }
            n=sum;
            if(n==1){
                break;
            }
            else if(n==4){
                return false;
            }
        }
        return true;
    }
}
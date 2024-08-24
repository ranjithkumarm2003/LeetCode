class Solution {
    public int totalMoney(int n) {
        int sum=0;
        int q=n / 7;  
        int r=n % 7;  
        
        for (int i =0; i<q;i++) {
            sum +=28 +7* i; 
        }
        
        for (int i =1;i<=r;i++) {
            sum += (q +i);
        }

        return sum;
    }
}

class Solution {
    public boolean isPerfectSquare(int num) {
        if(num==1||num==0)
        {
            return true;
        }
        for(int i=2;i<Math.pow(2,16);i++)
        {
            if((i*i)==num)
            {
                return true;
            }
        }
        return false;
    }
}
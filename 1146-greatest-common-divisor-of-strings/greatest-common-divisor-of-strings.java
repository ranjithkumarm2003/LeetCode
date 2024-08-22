class Solution {
    public String gcdOfStrings(String str1, String str2) {
        if ((str1 + str2).equals(str2 + str1)) {
            int a = str1.length();
            int b = str2.length();
            int gcd = gcd(a, b);
            return str1.substring(0, gcd);
        } else {
            return "";
        }
    }

    public int gcd(int a, int b) {
        int ans=0;
        for (int i = Math.min(a,b); i >= 1; i--) {
            if (a % i == 0 && b % i == 0) {
                ans=i;
                break;
            }
        }
        return ans;
    }
}
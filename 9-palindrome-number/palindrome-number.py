class Solution:
    def isPalindrome(self, x: int) -> bool:
        if x < 0 :
            return False
        res=0
        n=x
        while n!=0:
            rem=n%10
            res=res*10+rem
            n//=10
        print(res)
        return res==x
        
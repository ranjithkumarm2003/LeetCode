class Solution:
    def reverseWords(self, s: str) -> str:
        li=s.split(" ")
        ans=" "
        for i in li:
            ans=ans+ i[::-1]+" "
        print(li)
        return ans.strip()
        
class Solution {
    public int findLUSlength(String[] strs) {
        int lusl=-1;

        for(int i=0;i<strs.length;i++)
        {
          boolean isuncommon=true;
          for(int j=0;j<strs.length;j++)
          {
              if(i!=j && issubsequence(strs[i],strs[j]))
              {
                  isuncommon=false;
                  break;
              }

             
          }
          if(isuncommon)
              {
                  lusl=Math.max(lusl,strs[i].length());
              }
        }
        return lusl;
    }

    public boolean issubsequence(String s1,String s2)
    {
        int i=0,j=0;
        while(i<s1.length() && j<s2.length())
        {
            if(s1.charAt(i)==s2.charAt(j))
            {
                i++;
            }
            j++;
        }

        return i==s1.length();
    }
}
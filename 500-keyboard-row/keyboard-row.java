class Solution {
    public String[] findWords(String[] words) {
        String alpha[]={"QWERTYUIOPqwertyuiop","ASDFGHJKLasdfghjkl","ZXCVBNMzxcvbnm"};
        ArrayList<String>li=new ArrayList<>();
        for(int i=0;i<words.length;i++){
            char ch=words[i].charAt(0);
            int alpind=-1;
            for(int j=0;j<3;j++){
                if(alpha[j].indexOf(ch)!=-1){
                   alpind=j;
                    break;
                }
            }
            int c=0;
            for(int j=0;j<words[i].length();j++){
                if(alpha[alpind].indexOf(words[i].charAt(j))!=-1){
                    c++;
                }
            }
            if(c==words[i].length()){
               li.add(words[i]);
            }
        }
        // String ans[]=new String[li.size()];
        // int m=0;
        // for(String i:li){
        //     ans[m]=i;
        //     m++;
        // }
        return li.toArray(new String[0]);
    }
}
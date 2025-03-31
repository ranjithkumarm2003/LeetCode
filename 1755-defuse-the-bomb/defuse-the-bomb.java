class Solution {
    public int[] decrypt(int[] code, int k) {
        if(k==0){
             return new int[code.length];
        }
        else if(k>0){
            return pos(code,k);
          
        }
        else{
           return neg(code,k);
        
        }

      
    }
    public int[] pos(int code[],int k){
       int arr[]=new int[code.length];
       for(int i=0;i<code.length;i++){
        int sum=0;int ind=0;
        int j=0;
           if(i==code.length-1){
            j=0;
           }
           else{
            j=i+1;
           }
          for( ;j<code.length;j++){
            sum+=code[j];
            ind++;
            if(ind==k)break;
            if(j==code.length-1){
               j=-1;
            }
          }
          arr[i]=sum;
       }
       return arr;
    }
    public int[] neg(int code[],int k){
        int arr[]=new int[code.length];
       for(int i=0;i<code.length;i++){
        int sum=0;int ind=0;
        int j=0;
           if(i==0){
            j=code.length-1;;
           }
           else{
            j=i-1;
           }
          for( ;j>=0;j--){
            sum+=code[j];
            ind--;
            if(ind==k)break;
            if(j==0){
               j=code.length;
            }
          }
          arr[i]=sum;
       }
       return arr;
    }
}
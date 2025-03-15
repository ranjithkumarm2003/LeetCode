class Solution {
    public char slowestKey(int[] releaseTimes, String keysPressed) {
        int n=releaseTimes.length;
        int arr[]=new int[n];
        arr[0]=releaseTimes[0];
        char c=' ';
        for(int i=1;i<n;i++){
            arr[i]=releaseTimes[i]-releaseTimes[i-1]; 

        }
        int max=0;
        int ind=-1;
        for(int i=0;i<n;i++){
            if(arr[i]>max){
                max=arr[i];
                ind=i;
                if(keysPressed.charAt(i)>c){
                    c=keysPressed.charAt(i);
                    ind=i;
                }
            }
            else if(arr[i]==max){
                
                 if(keysPressed.charAt(i)>=c){
                    c=keysPressed.charAt(i);
                    ind=i;
                }
            }
        }
        return keysPressed.charAt(ind);

    }
}
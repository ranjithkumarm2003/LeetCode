class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int s=0;
        int e=people.length-1;
        int c = 0;
        while(s<=e){
            if(people[e]==limit){
                  e--;c++;
            }
            else{
                int tot=people[s]+people[e];
                if(tot==limit){
                    e--;s++;c++;
                }
                else if(tot>limit){
                    e--;c++;
                }
                else{
                    s++;e--;c++;
                }
            }
        }
        return c;
    }
}
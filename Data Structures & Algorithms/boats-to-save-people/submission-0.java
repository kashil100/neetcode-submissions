class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int i=0, j = people.length-1;
        int ans = 0;
        while(i<=j){
            int temp = (i == j)?people[i]:(people[i] + people[j]);
            if(temp <= limit){
                i++;j--;ans++;
            }else{
                ans++;
                j--;
            }
        }

        return ans;
    }
}
class Solution {
    public int findJudge(int n, int[][] trust) {
        int[] mp =new int[n+1];
        boolean[] temp = new boolean[n+1];

        for(int i=0;i<trust.length;i++){
            temp[trust[i][0]] = true;
            mp[trust[i][1]]++;
        }

        int count = 0, ans = -1;
        for(int i = 1;i<n+1;i++){
            if(mp[i] == n-1 && temp[i] == false){
                count++;
                ans = i;
            }
            if(count > 1){
                return -1;
            }
        }

        return (count == 1)?ans:-1;
    }
}
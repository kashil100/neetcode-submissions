class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        int n = position.length;
        Map<Integer, Integer> mp = new HashMap<>();
        for(int i=0;i<n;i++){
            mp.put(position[i], speed[i]);
        }

        Arrays.sort(position);
        double[] sec = new double[n];
        for(int i=0;i<n;i++){
            double s = (double)mp.get(position[i]);
            double temp = (double)target - position[i];
            sec[i] = (double)temp/s;
        }
        // for(int i=0;i<n;i++){
        //     System.out.print(position[i]+" ");
        // }
        double temp = 0;
        int ans = 0;
        for(int i=n-1;i>=0;i--){
            if(temp < sec[i]){
                ans++;
                temp = sec[i];
            }
        }

        return ans;


    }
}

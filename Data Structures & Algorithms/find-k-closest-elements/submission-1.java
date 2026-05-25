class Solution {
    public List<Integer> findClosestElements(int[] nums, int k, int x) {
        List<Integer> ans = new ArrayList<>();
        for(int i=0;i<k;i++){
            ans.add(nums[i]);
        }

        for(int i = k;i<nums.length;i++){
            int m = Math.abs(ans.get(0) - x);
            int n = Math.abs(nums[i] - x);
            if(n<m){
                ans.add(nums[i]);
                ans.remove(0);
            }
        }
        return ans;
    }
}
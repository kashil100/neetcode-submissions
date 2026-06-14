class Solution {
    public List<List<Integer>> ans;

    public void fun(int n, int[] nums, boolean[] vis, List<Integer> temp){

        if(temp.size() == n){
            ans.add(new ArrayList<>(temp));
            return;
        }
        for(int i=0;i<n;i++){
            if(vis[i]){
                continue;
            }
            temp.add(nums[i]);
            vis[i] = true;
            fun(n,nums,vis,temp);
            if(temp.size()>0){
                temp.remove(temp.size()-1);
            }

            vis[i] = false;
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        ans = new ArrayList<>();
        boolean[] vis = new boolean[nums.length];
        fun(nums.length,nums,vis,new ArrayList<>());
        return ans;
    }
}

class Solution {
    public List<List<Integer>> ans;
    public Set<List<Integer>> set;

    public void fun(int n, int[] nums, boolean[] vis, List<Integer> temp){

        if(temp.size() == n){
            if(!set.contains(temp)){
                ans.add(new ArrayList<>(temp));
                set.add(temp);
            }    
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
    public List<List<Integer>> permuteUnique(int[] nums) {
        ans = new ArrayList<>();
        set = new HashSet<>();
        boolean[] vis = new boolean[nums.length];
        fun(nums.length,nums,vis,new ArrayList<>());
        return ans;
        
    }
}
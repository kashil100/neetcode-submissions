class Solution {
    public void solution(int[] nums, int i, int sum, int target, List<Integer> temp, List<List<Integer>> ans){
        if(i == nums.length || sum>=target){
            if(sum == target && !ans.contains(temp)){
                ans.add(new ArrayList(temp));
            }
            return;
        }

        sum+=nums[i];
        temp.add(nums[i]);
        solution(nums,i,sum,target,temp,ans);
        sum-=nums[i];
        temp.remove(temp.size()-1);
        solution(nums,i+1,sum,target,temp,ans);
    }
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        solution(nums,0,0,target,new ArrayList<>(),ans);
        return ans;
    }
}

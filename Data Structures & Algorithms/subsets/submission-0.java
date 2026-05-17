class Solution {
    public void solution(int[] nums, int i, List<Integer> temp, List<List<Integer>> ans){
        if(i == nums.length){
            if(!ans.contains(temp)){
                ans.add(new ArrayList(temp));
            }
            return;
        }

        temp.add(nums[i]);
        solution(nums,i+1,temp,ans);
        temp.remove(temp.size()-1);
        solution(nums, i+1,temp,ans);
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        solution(nums, 0, new ArrayList<>(), ans);
        return ans;
    }
}

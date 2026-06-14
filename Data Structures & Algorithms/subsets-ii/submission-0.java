class Solution {
    List<List<Integer>> ans;
    Set<List<Integer>> set;

    public void fun(int i, int[] nums, List<Integer> temp){
        if(i == nums.length){
            if(!set.contains(temp)){
                ans.add(new ArrayList<>(temp));
                set.add(temp);
            }
            return;
        }

        temp.add(nums[i]);
        Collections.sort(temp);
        fun(i+1,nums,temp);
        temp.remove(Integer.valueOf(nums[i]));
        fun(i+1,nums,temp);
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        ans = new ArrayList<>();
        set = new HashSet<>();
        fun(0,nums,new ArrayList<>());
        return ans;
    }
}

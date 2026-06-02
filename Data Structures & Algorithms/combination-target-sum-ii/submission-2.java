class Solution {
    public void solution(int[] candidates, int i,int target,List<Integer> temp, List<List<Integer>> ans){
        if(target == 0){
            ans.add(new ArrayList<>(temp));
            return;
        }
        if(target < 0){
            return;
        }
        for(int j = i;j<candidates.length;j++){
            if(j>i && candidates[j] == candidates[j-1]){
                continue;
            }
            if(candidates[j] > target){
                break;
            }
            temp.add(candidates[j]);
            solution(candidates, j+1,target-candidates[j],temp,ans);
            temp.remove(temp.size()-1);
        }
    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> ans = new ArrayList<>();
        solution(candidates, 0,target,new ArrayList<>(),ans);
        return ans;
        
    }
}

class Solution {
    public List<List<Integer>> ans;

    public void fun(int x,int n, int k, List<Integer> temp){

        if(temp.size() == k){
            ans.add(new ArrayList<>(temp));
            return;
        }
        for(int i=x;i<=n;i++){
            temp.add(i);
            fun(i+1,n,k,temp);
            if(temp.size()>0){
                temp.remove(temp.size()-1);
            }
        }
    }
    public List<List<Integer>> combine(int n, int k) {
        ans = new ArrayList<>();
        fun(1,n,k,new ArrayList<>());
        return ans;
    }
}
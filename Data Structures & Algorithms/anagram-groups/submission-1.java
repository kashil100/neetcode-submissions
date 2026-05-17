class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, Integer> mp = new HashMap<>();
        List<List<String>> ans = new ArrayList<>();
        int idx = -1;
        for(String s: strs){
            int[] temp = new int[26];
            for(int i = 0;i<s.length();i++){
                int j = (int)(s.charAt(i)-'a');
                temp[j]++;
            }
            String key = Arrays.toString(temp);
            if(mp.containsKey(key)){
                ans.get(mp.get(key)).add(s);
            }else{
                List<String> sec = new ArrayList<>();
                sec.add(s);
                ans.add(new ArrayList<>(sec));
                idx++;
                mp.put(key,idx);
            }
        }

        return ans;
    }
}

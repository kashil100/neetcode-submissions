class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> list = new ArrayList<>();
        Map<String, Integer> mp = new HashMap<>();
        int k = 0;
        for(int i = 0; i< strs.length; i++){
            String s = strs[i];
            int[] a = new int[26];

            for(int j = 0;j<s.length();j++){
                a[s.charAt(j)-'a']++;
            }

            String key = Arrays.toString(a);
            if(mp.containsKey(key)){
                int p = mp.get(key);
                list.get(p).add(s);
            }else{
                mp.put(key,k);
                list.add(new ArrayList<>());
                list.get(k).add(s);
                k++;
            }
        }

        return list;
    }
}

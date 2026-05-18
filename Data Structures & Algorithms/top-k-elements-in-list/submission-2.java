class Pair{
    private int x;
    private int y;

    Pair(int x, int y){
        this.x = x;
        this.y = y;
    }
}


class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        PriorityQueue<Pair> pq = new PriorityQueue<>(
            (a,b)-> Integer.compare(b.x,a.x)
        );
        Map<Integer, Integer> mp = new HashMap<>();
        for(int num: nums){
            mp.put(num,mp.getOrDefault(num,0) + 1);
        }

        for(Map.Entry<Integer, Integer> entry: mp.entrySet()){
            pq.add(new Pair(entry.getValue(), entry.getKey()));
        }


        int[] ans = new int[k];
        k--;
        while(!pq.isEmpty() && k>=0){
            Pair pair = pq.poll();
            ans[k] = pair.y;
            k--;
        }

        return ans;
    }
}

class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        for(int num: nums){
            pq.offer(num);
        }
        int ans = 0;
        while(!pq.isEmpty() && k>0){
            ans = pq.poll();
            k--;
        }

        return ans;
    }
}

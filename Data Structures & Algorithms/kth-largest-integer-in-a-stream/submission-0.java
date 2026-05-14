class KthLargest {
    public PriorityQueue<Integer> minHeap;
    public int k;
    public int count = 0;
    public KthLargest(int k, int[] nums) {
        this.k = k;
        minHeap = new PriorityQueue<>();
        for(int i = 0;i<nums.length;i++){
            minHeap.offer(nums[i]);
            count++;
            if(count > k){
                minHeap.poll();
                count--;
            }
        }
    }
    
    public int add(int val) {
        minHeap.offer(val);
        count++;
        if(count > k){
            minHeap.poll();
            count--;
        }

        return minHeap.peek();
    }
}

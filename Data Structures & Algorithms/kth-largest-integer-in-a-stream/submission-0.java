class KthLargest {

    PriorityQueue<Integer> heap = new PriorityQueue<>();
    Integer kSize = 0;
    public KthLargest(int k, int[] nums) {
        kSize = k;
        for (int num: nums) {
            heap.add(num);
            if (heap.size() > kSize) {
                heap.poll();
            }
        }
    }
    
    public int add(int val) {
        heap.add(val);
        if (heap.size() > kSize){ 
            heap.poll();
        }

        return heap.peek();
    }
}

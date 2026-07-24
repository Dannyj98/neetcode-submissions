class Solution {
    public int lastStoneWeight(int[] stones) {
        
        PriorityQueue<Integer> q = new PriorityQueue<>(Collections.reverseOrder());
        for (int stone: stones) {
            q.offer(stone);
        }

        while (q.size() > 1) {
            int stone1 = q.poll();
            int stone2 = q.poll();

            if (stone1 != stone2) {
                stone2 = Math.abs(stone1 - stone2);
                q.offer(stone2);
            } 
        }

        if (q.size() == 1) {
            return q.poll();
        } else { 
            return 0;
        }
    }
}

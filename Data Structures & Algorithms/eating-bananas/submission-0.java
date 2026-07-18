class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        // Find the max value;
        int min = 1;
        int max = piles[0];

        for (int i = 0; i < piles.length; i++) {
            if (piles[i] > max) {
                max = piles[i];
            }
        }

        int res = max;
        
        while (min <= max) {
            int mid = min + (max - min) / 2;
            long totalTime = simulateKoko(piles, mid);

            if (totalTime <= h) {
                res = mid;
                max = mid - 1;
            } else {
                min = mid + 1; // eat more bananas per hour
            }

        }
        return res;
        
    }

    public long simulateKoko(int[] piles, int b) {

        long hours = 0;
        for (int i = 0; i < piles.length; i++) {
            hours += Math.ceil((double) piles[i] / b);
        }
        
        return hours;
    }

}

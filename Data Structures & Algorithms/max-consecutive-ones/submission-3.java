class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int counter = 0;
        int max = 0;

        for (int num : nums) {
            counter = (num == 1) ? counter + 1: 0;
            max = Math.max(max, counter);
        }

        return max;
    }
}
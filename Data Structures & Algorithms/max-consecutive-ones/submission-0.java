class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int counter = 0;
        int max = 0;
        boolean lastNumWas1 = false;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                counter += 1;
                lastNumWas1 = true;
            } else {
                if (counter > max) {
                    max = counter;
                }
                counter = 0;
                lastNumWas1 = false;
            }
        }

        if (counter > max) {
            max = counter;
        }

        return max;
    }
}
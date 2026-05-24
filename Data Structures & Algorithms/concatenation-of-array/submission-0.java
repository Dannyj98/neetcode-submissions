class Solution {
    public int[] getConcatenation(int[] nums) {
        // Brute force approach
        int length = nums.length;
        int[] ans = new int[2 * length];
        
        for (int i = 0; i < 2; i++) {
            for (int x = 0; x < length; x++) {
                ans[i * length + x] = nums[x];
            }
        }
        return ans;

    }
}
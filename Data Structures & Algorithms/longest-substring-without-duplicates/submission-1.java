class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        HashMap<Character, Integer> map = new HashMap<>();

        int l = 0;
        int r = 0;
        int maxSubString = 0;

        while (r < s.length()) {
            char c = s.charAt(r);

            if (map.containsKey(c)) {
                l++;
                r = l;
                map.clear();
            } else {
                map.put(c, 0);
                r++;
            }
        
        maxSubString = Math.max(maxSubString, (r - l));
        }
        return maxSubString;
    }
}

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        HashMap<String, List<String>> res = new HashMap<>();

        for (String wrd: strs) {
            int[] count = new int[26];
            for (Character c: wrd.toCharArray()) {
                count[c - 'a'] += 1;
            }
            // ["abc"] -> [1,1,1,0,0,0,0....]
            String key = Arrays.toString(count);

            res.putIfAbsent(key, new ArrayList<>());
            res.get(key).add(wrd);
        }

        return new ArrayList<>(res.values());

    }
}

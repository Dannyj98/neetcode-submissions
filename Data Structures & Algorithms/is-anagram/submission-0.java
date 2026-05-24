class Solution {
    public boolean isAnagram(String s, String t) {

        if (s.length() != t.length() ) {
            return false;
        }

        HashMap<Character, Integer> sMap = new HashMap<>();
        HashMap<Character, Integer> tMap = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            Character sc = s.charAt(i);
            Character st = t.charAt(i);

            if (sMap.containsKey(sc)) {
                sMap.put(sc, sMap.get(sc) + 1);
            } else {
                sMap.put(sc, 1);
            }

            if (tMap.containsKey(st)) {
                tMap.put(st, tMap.get(st) + 1);
            } else {
                tMap.put(st, 1);
            }
        }
        return tMap.equals(sMap);
    }
}

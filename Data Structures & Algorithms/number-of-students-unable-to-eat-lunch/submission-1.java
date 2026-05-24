class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int student: students) {
            map.put(student, map.getOrDefault(student, 0) + 1);
        }

        for (int sandwich : sandwiches) {
            // look up if we have any students who will take the sandwich
            if (map.getOrDefault(sandwich, 0) > 0) {
                map.put(sandwich, map.get(sandwich) - 1);
            } else {
                break;
            }
        }

        return map.getOrDefault(0, 0) + map.getOrDefault(1, 0);
    }
}
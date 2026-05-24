class Solution {
    public int countStudents(int[] students, int[] sandwiches) {

        Queue<Integer> queue = new LinkedList<>();
        for (int student: students) {
            queue.offer(student);
        }

        // keep counter to see if we've tried all the students
        for (int sandwich: sandwiches) {
            int counter = 0;
            while (counter < students.length && queue.peek() != sandwich) {
                queue.offer(queue.poll()); // put 1st item in back
                counter++;
            }

            if (queue.peek() == sandwich) {
                queue.poll();
            } else {
                break;
            }
        }
        return queue.size();
        // check if student wants sandwich

        // if they do, remove them from the queue and set the sandwich to -1

        // else send them to the back of the queue

    }
}
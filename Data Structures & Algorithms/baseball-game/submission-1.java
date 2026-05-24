class Solution {
    public int calPoints(String[] operations) {
        
        Stack<Integer> stack = new Stack<>();
        int total = 0;

        for (String op : operations) {
            if (op.equals("+")) {
                int top = stack.pop();
                int newTop = stack.peek() + top;
                stack.push(top);
                stack.push(newTop);
                total += newTop;

            } else if (op.equals("D")) {
                int newTop = stack.peek() * 2;
                stack.push(newTop);
                total += newTop;
            } else if (op.equals("C")) {
                int pop = stack.pop();
                total -= pop;
            } else {
                stack.push(Integer.parseInt(op));
                total += Integer.parseInt(op);
            }
        }
        return total;

    }
}
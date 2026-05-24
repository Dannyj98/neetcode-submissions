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
                stack.push(stack.peek() * 2);
                total += stack.peek();
            } else if (op.equals("C")) {
                total -= stack.pop();
            } else {
                stack.push(Integer.parseInt(op));
                total += stack.peek();
            }
        }
        return total;

    }
}
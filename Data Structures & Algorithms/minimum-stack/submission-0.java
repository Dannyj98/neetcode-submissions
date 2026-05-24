class MinStack {

    private Stack<Integer> stack = new Stack<>();
    private Stack<Integer> minStack = new Stack<>();


    public MinStack() {
        
    }
    
    public void push(int val) {
        stack.push(val);
        if (minStack.empty() ){
            minStack.push(val);
        } else if (minStack.peek() >= val) {
            minStack.push(val);
        }
    }
    
    public void pop() {
        if (stack.empty()) {
            return;
        }

        int num = stack.pop();
        if(minStack.peek() == num) {
            minStack.pop();
        }
    
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        return minStack.peek();
    }
}

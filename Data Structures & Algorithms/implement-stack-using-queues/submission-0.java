class MyStack {
    Queue<Integer> stack;
    Queue<Integer> temp;

    public MyStack() {
        stack = new ArrayDeque<>();
        temp = new ArrayDeque<>();
    }
    
    public void push(int x) {
        temp.offer(x);
        while(!stack.isEmpty()){
            temp.offer(stack.poll());
        }

        Queue<Integer> sec = stack;
        stack = temp;
        temp = sec;
    }
    
    public int pop() {
        return stack.poll();
    }
    
    public int top() {
        return stack.peek();
    }
    
    public boolean empty() {
        return stack.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */
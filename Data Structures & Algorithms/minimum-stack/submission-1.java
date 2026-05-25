class MinStack {
    public int minEle;
    public Deque<Integer> stack;
    public Deque<Integer> preStack;

    public MinStack() {
        minEle = Integer.MAX_VALUE;
        stack = new ArrayDeque<>();
        preStack = new ArrayDeque<>();
    }
    
    public void push(int val) {
        minEle = Math.min(minEle, val);
        preStack.push(minEle);
        stack.push(val);
    }
    
    public void pop() {
        stack.pop();
        preStack.pop();
        if(preStack.isEmpty()){
            minEle = Integer.MAX_VALUE;
        }else{
            minEle = preStack.peek();
        }
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        return preStack.peek();
    }
}

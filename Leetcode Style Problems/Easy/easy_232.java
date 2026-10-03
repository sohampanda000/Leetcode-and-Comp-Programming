// 232. Implement Queue using Stacks
public class MyQueue {
    private Stack<Integer> inputStack;
    private Stack<Integer> outputStack;
    public MyQueue() {
        inputStack = new Stack<>();
        outputStack = new Stack<>();
    }
    public void push(int x) {
        inputStack.push(x);
    }
    public int pop() {
        transferIfNeeded();
        return outputStack.pop();
    }
    public int peek() {
        transferIfNeeded();
        return outputStack.peek();
    }
    public boolean empty() {
        return inputStack.empty() && outputStack.empty();
    }
    private void transferIfNeeded() {
        if (outputStack.empty()) {
            while (!inputStack.empty()) {
                outputStack.push(inputStack.pop());
            }
        }
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */

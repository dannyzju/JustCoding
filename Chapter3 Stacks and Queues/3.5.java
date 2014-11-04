// <T> means Generic Types
// Reference: http://blog.csdn.net/zhengqiqiqinqin/article/details/9002209

public class MyQueue<T> {
    Stack<T> newStack, oldStack;

    public void MyQueue(){
    	newStack = new Stack<T>;
    	oldStack = new Stack<T>;

    }

    public int size(){
    	return oldStack.size()+newStack.size();

    }
    public void push(T value) {
        newStack.push(value);
    }

    public T pop() {
        if (!newStack.isEmpty()) {
            oldStack.push(newStack.pop());
        }
        return oldStack.pop();
    }

    public T peek(){
    	if (!newStack.isEmpty()) {
    		oldStack.push(newStack.pop());
    	}
    	return oldStack.peek();
    }


}
// My original way:

class SetOfStacks {
	int stackSize = 20; //Set the default stack size;
	int stackIndex;
	Stack[] stackSet = new Stack<Integer>[5];
	public void push(int value){
		if (stackSet[stackIndex].size>=20) {
			stackIndex++;
		}
		stackSet[stackIndex].push(value);
	}

	public void pop(){
		if (stackSet[stackIndex].isEmpty()) {
			stackIndex--;
		}
		stackSet[stackIndex].pop();
	}

	public void popAt(int index){
		stackSet[index].pop();
	}

}

// Official Answer: great way!

public class SetOfStacks{
	ArrayList<Stack> stacks = new ArrayList<Stack>();
	public int capacity;
	public int SetOfStacks(int capacity){
		this.capacity = capacity;
	}

	public Stack getLastStack(){
		if (stacks.size()==0) {
			return null;
		} else {
			return stacks.get(stacks.size()-1);
		}
	}

	public void push(int value){
		Stack s = getLastStack();
		if (s!=null && !s.isfull()) {
			s.push(value);
		} else{
			Stack s = new Stack(this.capacity);
			s.push(value);
			stacks.add(s);
		}

	}

	public int pop(){
		Stack s = getLastStack();
		int value = s.pop();
		if (s.isEmpty()) {
			stacks.remove(stacks.get(stacks.size()-1))；
		}
		return value;
	}

	public int popAt(int index){
		return leftShift(index, true);}

    //Here when popping one from middle, all the following items should have a leftShift.
	public int leftShift(int index, boolean removeTop){
		Stack stack = stacks.get(index);
		int removed_item;
		if (removeTop) {
			removed_item = stack.pop();
		} else {
			removed_item = stack.removeBottom();
		}

		if (stack.isEmpty) {
			stacks.remove(index);
		} else if(stacks.size()>index+1){
			stack.push(leftShift(index+1, false));
		}

		return removed_item;
	}

}
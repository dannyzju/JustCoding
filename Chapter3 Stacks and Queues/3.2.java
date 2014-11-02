// Method 1:
public class StackWithMin extends stack<NodeWithMin>{
	public void push(int value){
		int newMin = Math.min(value, min());
		super.push(new NodeWithMin(value, newMin));
	}

	public int min(){
		if (this.isEmpty()) {
			return Integer.MAX_VALUE; // Error value
			
		} else {

			return peak.min();
		}

	}

	class NodeWithMin{
		public int value;
		public int min;
		public NodeWithMin（int v, int min）{
			value = v;
			this.min = min;
		}
	}
}

//Method 2:
public class StackWithMin2 extends Stack<Integer>{
	Stack<Integer> s2;
	public void push(int value){
		if (value<=min()) {
			s2.push(value);
		}
		super.push(value);
	}

	public int pop(){
		int value = super.pop();
		if (value == min()) {
			s2.pop();
		}
		return value;
	}

	public int min(){
		if (s2.isEmpty()) {
			return Integer.MAX_VALUE;
		}
		return s2.peek();
	}
	}

}
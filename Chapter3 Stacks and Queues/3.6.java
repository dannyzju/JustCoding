public void sortStatck(Stack s1){
	Stack<Integer> r = new Stack<Integer>();
	while(!s1.isEmpty()){
		int tmp = s.pop();
		while(!r.isEmpty()){
			if (r.peek()>tmp) {
				s.push(r.pop());
			}
			r.push(tmp);
		}
	}
	return r;
}
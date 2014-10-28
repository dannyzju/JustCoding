// My solution: WRONG!! LinkedList is not ArrayList
public void removeDup(LinkedList list) {
    for (int i = 0; i < list.size() ; i++ ) {
        obj list.get(i);
        for (int j = i + 1; j < list.size(); j++) {
        	if(obj == list.get(j)){
        		list.remove(j);
        	}

        }
    }
}

//

public static void deleteDup(LinkedListNode head){
	if (head == null) {
	  return;	
	}

	LinkedListNode current = head;
	while(current!=null){
		LinkedListNode runner = current;
		while（runner.next!=null）{
			if (runner.next.data == current.data) {
				runner.next = runner.next.next;
			} else {
				runner = runner.next；
			}
		}
	}
}
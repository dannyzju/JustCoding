// Trivial Solution:
public LinkedListNode findKtoLast(LinkedListNode head, int k) {
    int indicator = 0;
    LinkedListNode runner = head;

    while (runner.next() != null) {
        indicator++;
    }
    if (k > indicator) {
        return null;

    } else if (k == indicator) {
        return head;
    } else {
    	while(indicator!=k){

    		head=head.next();
    		indicator--;
    	}
    }

}

// Recursive Solution:

public static int nthToLast(LinkedListNode head, int k){
	if (head==null) {
	return 0;		
	}

	int i = nthToLast(head.next(), k)+1;

	if (i==k) {
		System.out.println(head.data);
	}

	return i;
}
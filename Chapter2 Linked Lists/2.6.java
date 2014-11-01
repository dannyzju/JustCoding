/*
A really clever way! 

*/

public static LinkedListNode findBeginning(LinkedListNode m) {
    LinkedListNode fast = m;
    LinkedListNode slow = m;

    while (fast != null && fast.next != null) {
        fast = fast.next.next;
        slow = slow.next;
        if (fast == slow) {
        	
            break;

        }
    }

    if (fast==null ||fast.next==null) {
    	return null;
    }

    fast = m;
    while (fast!=slow) {
        fast = fast.next;
        slow = slow.next;
    }
    return slow

}
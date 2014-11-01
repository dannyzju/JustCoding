// Method No.1: reverse and compare!
public static boolean isPalindome(LinkedListNode head) {

}

// Method No.2: reverse and compare! Iterative?
public static boolean isPalindome(LinkedListNode head) {
    //Step 1: find the middle point
    LinkedListNode fast = head;
    LinkedListNode slow = head;
    Stack<Integer> buffer = new Stack<Integer>();

    while (fast != null && fast.next != null) {
        buffer.push(slow.data);
        fast = fast.next.next;
        slow = slow.next;
    }

    // It has the odd number of elements, so skip the middle element

    if (fast != null) {
        slow = slow.next;
    }

    //Step 2: stack the first half to a stack
    while (slow != null) {
        int top = buffer.pop().intValue();
        if (slow.data != top) {
            return false;
        }
        slow = slow.next;
    }
    return true;
}



// Method 3: Recursive
// Helper classes

class Result {
    public boolean result;
    public LinkedListNode node;
}

boolean isPalindome(LinkedListNode m){
    Result p = isPalindomeRecur(m, ListSize(m));
    return result.result;
}


public Result isPalindomeRecur(LinkedListNode head, int length) {
    if (head == null || length == 0) {
        return new Result(null, true);
    } else if (length == 1) {
        return new Result(head, true);
    } else if (length == 2) {
        return new Result(head.next.next, head.data==head.next.data);
    }

    return isPalindomeRecur(head.next, length -2);
}




























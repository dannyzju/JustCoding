// My solution:
public static LinkedListNode sumMethod(LinkedListNode n1, LinkedListNode n2) {
    if (n1 == null) {
        return n2;
    } else if (n2 == null) {
        return n1;
    }
    int plus = 0;

    while (n1 != null && n2 != null) {
        n1.data = n1.data + n2.data;
        if (n1.data > 10) {
            n1.data -= 10;
            plus = 1;
        } else {
            plus = o;
        }
        n1 = n1.next;
        n2 = n2.next;

    }

    if (n2 != null) {
        n1 = n2;
    }
        n1.data += plus;
        return  head1;

}

// Recursive Solution:
// Have read the solution.
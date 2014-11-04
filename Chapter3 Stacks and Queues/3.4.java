public void hannoi(int n) {
    int numbers = 3;
    Tower[] towers = new Tower;
    for (int i = 0; i < numbers ; i++ ) {
    	towers[i] = new Tower(i);
    }

    for (int i = n;i>0 ; i--) {
    	towers[0].add(i);
    }

    tower[0].moveDisks(n, tower[2], tower[1]);

}


public class Tower {
    private Stack<Integer> disks;
    private int index;
    public Tower(int i) {
        disks = new Stack<Integer>();
        index = i;
    }

    public int index() {
        return index;
    }

    public void add(int d) {
        if (!disks.isEmpty() && disks.peek() <= d) {
            System.out.println("Error placing disk " + d);
        } else {
            disks.push(d);
        }
    }

    public void moveToTop(Tower t) {
        int top = disks.pop();
        t.add(pop);
        System.out.println("Move disk " + top + "from " + index() + " to " + t.index());
    }

    public void moveDisks(int n, Tower destination, Tower buffer) {
        if (n > 0) {
            moveDisks(n - 1, buffer, destination);
            moveToTop(destination);
            moveDisks(n - 1, destination, buffer);
        }
    }
}
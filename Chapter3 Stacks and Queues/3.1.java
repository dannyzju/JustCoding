//Single Array for Three Stacks?
// Method 1: Fixed Division
int stackSize = 100;
int[] buffer = new int [stackSize * 3];
int[] stacksIndicator = { -1, -1, -1};

public absStackTopIndex(int stackNum) {
    return stackSize * stackNum + stacksIndicator[stackNum];
}

public void push(int stackNum, int value) throws Exception {
    if (stacksIndicator[stackNum] > stackSize) {
        throw new Exception("Out of space.");
    } else {
        stacksIndicator[stackNum]++;
        buffer[absStackTopIndex(stackNum)] = value;
    }
}

public int pop(int stackNum) throws Exception {

    if (stacksIndicator[stackNum] == -1) {
        throw new Exception("Trying to pop an empty stack.");
    }
    int value = buffer[absStackTopIndex(stackNum)];
    buffer[absStackTopIndex[stackNum]] = null;
    absStackTopIndex[stackNum] --;
    return value;
}

public int peak(int stackNum) {
    if (absStackTopIndex[stackNum] == stackNum * stackSize) {
        return null;
    }
    return value = buffer[absStackTopIndex[stackNum]];
}

public boolean isEmpty(int stackNum) {
    if (absStackTopIndex(stackNum) == stackNum * stackSize) {
        return true;
    } else {
        return false;
    }
}

// Method 2: Flexible Division


int[] buffer = new int[300];

int[] indicators = { -1, -1, -1};

public int stackSize() {
    return indicators[0] + indicators[1] + indicators[2] + 3;
}

public int getAbsIndex(int stackSize) {

    if (stackSize == 0) {
        return indicators[0];
    } else if (stackSize == 1) {
        return indicators[0] + indicators[1];
    } else if (stackSize == 2) {
        return indicators[0] + indicators[1] + indicators[2];
    }
}

public void push(int stackNum, int value) {
    if (stackSize >= 300) {
        throw new Exception("The stack is full now!");
    }
    int shreshould = getAbsIndex(stackNum);
    for (int i = stackSize ; i > shreshould; i-- ) {
        buffer[i + 1] = buffer[i];
    }
    buffer[shreshould] = value;
}

public int pop(int stackNum) {
    if (indicators[stackNum]  == -1) {
        throw new Exception("This stack is empty!");
    } else {
        int shreshould = getAbsIndex(stackNum);
        int value = buffer[shreshould];

        for (int i = shreshould; i < stackSize - 1 ; i++ ) {
            buffer[i] = buffer[i + 1];
        }
        buffer[stackSize - 1] = 0;
        indicators[stackNum] --;
    }

}

public int peak(stackNum) throw Exception {
	if (indicators[stackNum] == -1) {
		throw new Exception("This stack is empty!!");
	} else {
		int shreshould = getAbsIndex(stackNum);
		return buffer[shreshould];
	}

}

public boolean isEmpty(stackNum){
	if (indicators[stackNum]>=0) {
		return true;
	} else {
		return false;
	}

}




























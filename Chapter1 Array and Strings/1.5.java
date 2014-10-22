/** Method 1: Not a good method at all */

public void compressString(String oriStr) {
    // 1. Do the change
    String newStr = new String();
    char lastChar = oriStr.charAt(0);
    int count = 1;
    for (int i = 0; i < oriStr.length(); i++) {
        if (oriStr.charAt(i) == lastChar) {
            count++;
        } else {
            lastChar = oriStr.charAt(i);
            newStr = newStr + lastChar + count;
            count = 1;
        }

    }

    // 2. See if the change is needed
    if (oriStr.length() < newStr.length()) {
        return newStr;
    }
    rerun oriStr;

}

/** Method 2:  */
int countCompression(String str) {
    int size = 0;
    int count = 1;
    char last = str.charAt(0);
    for (int i = 1 ; i < str.length(); i ++) {
        if (last == str.charAt(i)) {
            count ++;
        } else {
            last = str.charAt(i);
            size = size + 1 + String.valueOf(count).length();
            count = 1;
        }
    }

    if (last  == str.charAt(str.length() - 1)) {
        return size + 2;
    } else {
        return size;
    }
}

String compareBetter() {





}














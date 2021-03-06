public boolean isPermutation(String str1, String str2) {
    if (str1.length() != str2.length())
        return false;

    // if they have the same characters.


    int[] indicator = new int[256];
    for (int i = 0; i < indicator.size() ; i++) {
        indicator[i] = 0;
    }

    for ( int i = 0 : i < str1.length() : i++) {
        int val = str1.charAt(i);
        indicator[val] + = 1;

    }

    for (int i = 0; i < str2.length(); i++) {
        int val = str2.charAt(i);
        indicator[val] -= 1;
    }

    for (int i = 1; i < indicator.size(); i++) {
        if (indicator[i] != 0)
            return false;
    }

    // if the orders are correct.


    /**---------- Official Answers --------------------*/

    /** ----------- Solution 1 ----------- */
    public String sort(String str) {
        char[] content = str.toCharArray();
        java.util.Arrays.sort(content);
        return new String(content);
        // Need more investigation on java apis
    }

    public boolean ifPermutation(String str1, String str2) {
        if (str1.length() != str2.length())
            return false;

        return sort(str1).equals(sort(str2));

    }

    /** -------------- Solution 2 ---------- */
    public boolean isPermutation(String str1, String str2) {
        if (str1.length() != str2.length())
            return false;
        int[] letters = new int[256];  // Assumption
        char[] s_arrray = str1.toCharArray();

        for (c : s_arrray1) {
            letters[c]++;
        }


        for (int i = 0; i < str2.length(); i++) {
            int c = (int)str2.charAt(i);
            if (--letters[c] < 0) {    //Danny: why must "<" ??
                return false
            }
        }

        return true;

    }



public boolean isUniqueString (String str) {

    if (str.length() > 256)   //

        return false;

    boolean[] indicator = new boolean[256];

    for (int i = 0 ; i < str.length(); i++) {
        if (indicator[str.charAt(i)]) {
            return false;

        }
        indicator[str.charAt(i)] = true;

    }
    return true;


}
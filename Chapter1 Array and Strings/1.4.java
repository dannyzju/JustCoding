public String replaceString(String s) {
    int val = 0;
    for (int i = 0; s.length(); i++) {
        if (s.charAt(i == " ")) {
            val++
        }
    }

    char[] newChars = new char[str.length() + val * 2] {
        int j = 0;
for (int i = 0; i < str.length(); i++ ) {

    if (str.charAt(i) != " ") {
            newChars[j] = str.charAt(i);
            j++
        } else {
            newChars[j] = "%";
            newChars[j + 1] = "2";
            newChars[j + 2] = "0";
            j = j + 3;

        }

    }

    }
    retern new String(newChars);

}
public boolean isRotation(String s1, String s2) {
    String s1new = s1 + s1;
    if (isSubstring(s2, s1new)) {
        return true;

    }
    return false;
}

// Comment:
//   Rotation means at least the length of the two strings should be the same!
// So need to add this logic also.
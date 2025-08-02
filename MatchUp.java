public int matchUp(String[] a, String[] b) {
  int result = 0;
  
    for (int i = 0; i < a.length; i++) {
        if (a[i].length() > 0 && b[i].length() > 0) {
            if (a[i].substring(0, 1).equals(b[i].substring(0, 1))) {
                result++;
            }
        }
    }
    return result;
}


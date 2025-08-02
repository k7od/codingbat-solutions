public int scoreUp(String[] key, String[] answers) {
  int total = 0;

  for (int i = 0; i < key.length; i++) {
    String correct = key[i];
    String student = answers[i];

    if (!student.equals("?")) {
      if (student.equals(correct)) {
        total=total+ 4; }
      else {
        total=total- 1;
      }
    }
  }
  return total;
}


public int makeChocolate(int small, int big, int goal) {
  int bigCou = goal / 5;

  if (bigCou > big) {
    bigCou = big;
  }
  int remaining = goal - (bigCou * 5);
  if (small >= remaining) {
    return remaining; }
  else {
    return -1;
  }
}


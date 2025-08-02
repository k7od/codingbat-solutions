public boolean scoresIncreasing(int[] scores) {
  int i = 1;
  
  while (i < scores.length) {
    if (scores[i] < scores[i-1]) {
      return false;
    }
    i++;
  }
  return true;
}


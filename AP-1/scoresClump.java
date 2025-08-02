public boolean scoresClump(int[] scores) {
  for (int i = 0; i < scores.length - 2; i++) {
    int max = Math.max(scores[i], Math.max(scores[i+1], scores[i+2]));
    int min = Math.min(scores[i], Math.min(scores[i+1], scores[i+2]));
    if (max - min <= 2) {
      return true;
    }
  }
  return false;
}


public class Question2 {
    private final boolean[] results;
    private int recorded;

    public Question2(int questionCount) {
        results = new boolean[questionCount];
        recorded = 0;
    }

    public void recordAnswer(boolean correct) {
        if (recorded < results.length) {
            results[recorded] = correct;
            recorded++;
        }
    }

    public int getScore() {
        int score = 0;

        for (int i = 0; i < recorded; i++) {
            if (results[i]) {
                score++;
            }
        }

        return score;
    }
}
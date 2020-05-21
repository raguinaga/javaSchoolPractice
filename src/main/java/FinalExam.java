public class FinalExam extends GradedActivity {
    private final int numQuestions;
    private final double pointsEach;
    private final int numMissed;

    public FinalExam(int questions, int missed) {
        double numericScore;

        // Set the numQuestions and numMissed fields
        numQuestions = questions;
        numMissed = missed;


        /* Calculate the points for each question and numeric score
         for the exam */

        pointsEach = 100.0 / questions;
        numericScore = 100.0 - (missed * pointsEach);

        // Call the inherited setSCore method to set the numeric score
        setScore(numericScore);

        adjustScore();
    }

    /**
     * Returns the number of points each question
     * is worth
     *
     * @return The value in the points each field
     */
    public double getPointsEach() {
        return pointsEach;
    }

    public int getNumMissed() {
        return numMissed;
    }

    private void adjustScore() {
        double fraction;

        // Get the fractional part of the score
        fraction = score - (int) score;

        /*If the fractional is .5 or greater round the
        score up to the next whoel number*/
        if (fraction >= .5) {
            score += (1.0 - fraction);
        }
    }
}

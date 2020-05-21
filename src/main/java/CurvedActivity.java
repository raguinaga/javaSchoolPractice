public class CurvedActivity extends GradedActivity {
    double rawScore;
    double percentage;

    /**
     * The constructor sets the curve percentage
     *
     * @param percent The curve percentage
     */
    public CurvedActivity(double percent) {
        percentage = percent;
        rawScore = 0.0;
    }

    /**
     * This setScore method overrides the super's method
     * This is an unadjusted score, which is then curved
     * and the curved score is stored in the super's
     * score field
     *
     * @param s The unadjusted score
     */
    @Override
    public void setScore(double s) {
        rawScore = s;
        super.setScore(rawScore * percentage);
    }

    /**
     * Returns the raw score
     *
     * @return Value in the rawScore field
     */
    public double getRawScore() {
        return rawScore;
    }

    /**
     * Returns the curve percentage
     *
     * @return The value in the percentage field
     */
    public double getPercentage() {
        return percentage;
    }
}

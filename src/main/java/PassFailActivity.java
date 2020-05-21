public class PassFailActivity extends GradedActivity {
    private final double minPassingScore;

    public PassFailActivity(double mps) {
        minPassingScore = mps;
    }

    @Override
    public char getGrade() {
        char letterGrade;

        if (score >= minPassingScore) {
            letterGrade = 'P';
        } else {
            letterGrade = 'F';
        }
        return letterGrade;
    }
}

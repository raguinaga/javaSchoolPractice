public class PassFailExam extends PassFailActivity {
    private final int numQuestions;
    private final double pointsEach;
    private final int numMissed;

    public PassFailExam(int questions, int missed, double minPassing) {
        super(minPassing);
        double numericScore;

        numQuestions = questions;
        numMissed = missed;

        pointsEach = 100.0 / questions;
        numericScore = 100.0 - (missed * pointsEach);

        setScore(numericScore);
    }

    public double getPointsEach() {
        return pointsEach;
    }

    public int getNumMissed() {
        return numMissed;
    }
}

public class FinalExam3 extends GradedActivity implements Relatable{
    private int numQuestions;
    private double pointsEach;
    private int numMissed;

    /**
     * Sets up all fields of a Final exam, using the number of questions
     * and number of questions missed to set up points per question and
     * a numeric score for the exam.
     * @param numQuestions Number of questions on the exam.
     * @param numMissed Number of questions the student missed.
     */
    public FinalExam3(int numQuestions, int numMissed) {
        double numericScore;

        //Set the numQuestions and numMissed fields
        this.numQuestions = numQuestions;
        this.numMissed = numMissed;

        // Calculate the points per question and the
        // numeric score for this exam.
        pointsEach = 100.0 / numQuestions;
        numericScore = 100.0 - (numMissed * pointsEach);

        // Call the inherited setScore Method to
        // set the numeric score
        setScore(numericScore);
    }

    /**
     * Gets the number of questions on the exam
     * @return Number of questions on exam
     */
    public int getNumQuestions() {
        return numQuestions;
    }

    /**
     * Gets the points each question is worth
     * @return Points per question
     */
    public double getPointsEach() {
        return pointsEach;
    }

    /**
     * Gets the number of questions the student missed
     * @return Number of questions missed by student.
     */
    public int getNumMissed() {
        return numMissed;
    }

    /**
     * Implementation of equals method from Relatable interface.
     * Lets you know if the scores of two exams are the same
     * @param g A GradedActivity object, or one of its descendants
     * @return A true or false value, signaling whether two exams are
     * equal or not
     */
    @Override
    public boolean equals(GradedActivity g) {
        boolean status;

        if (this.getScore() == g.getScore()){
            status = true;
        } else {
            status = false;
        }

        return  status;
    }

    /**
     * Implementation of isGreater from the Relatable interface.
     * Compares the current exam to another exam to see whether this
     * exam has a higher score.
     * @param g A GradedActivity object, or one of its' descendants
     * @return A true or false value, signaling whether this exam has
     * the higher score.
     */
    @Override
    public boolean isGreater(GradedActivity g) {
        boolean status;

        if (this.getScore() > g.getScore()) {
            status = true;
        } else {
            status = false;
        }

        return status;
    }

    /**
     * Implementation of the Relatable interface's isLess method.
     * Compares this exam to another exam to see which has the lower score.
     * @param g A GradedActivity object, or a descendant of it.
     * @return A true or false value, signaling whether this exam has a
     * lower score.
     */
    @Override
    public boolean isLess(GradedActivity g) {
        boolean status;

        if (this.getScore() < g.getScore()) {
            status = true;
        } else {
            status = false;
        }

        return status;
    }
}

public abstract class Polymorphic {
    private GradedActivity[] exams = new GradedActivity[3];

    /**
     * Takes the GradedActivity array and populates it with
     * a GradedActivity, PassFailExam, and FinalExam
     */
    public Polymorphic() {
        exams[0] = new GradedActivity();
        exams[0].setScore(95);

        exams[1] = new PassFailExam(20,5,60);

        exams[2] = new FinalExam(50,7);
    }

    public void print() {
        for (int i = 0; i < exams.length; i++) {
            System.out.println("Test " + (i + 1) + ": "+
                    "score " + exams[i].getScore() +
                    ", grade " + exams[i].getGrade());
        }
    }
    /*
    * This method can take GradedActivity and all classes
    * that extend it (i.e. FinalExam, PassFailExam etc)
    * Thus it's considered polymorphic*/
    public void displayGrades(GradedActivity g){
        System.out.println("Score: " + g.getScore() +
                            ", grade " + g.getGrade());
    }
}

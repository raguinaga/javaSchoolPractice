public class Main {
    public static void main(String[] args) {

        GradedActivity exam1 = new FinalExam(50,7);
        GradedActivity exam2 = new PassFailActivity(70);
        GradedActivity exam3 = new PassFailExam(100,10,70);

        exam2.setScore(70);
        System.out.println(exam2.getGrade());
        GradedActivity[] exams = Polymorphic();
        for (int i = 0; i < exams.length; i++) {
            System.out.println("Test " + (i + 1) + ": "+
                    "score " + exams[i].getScore() +
                    ", grade " + exams[i].getGrade());
        }
    }

    /**
     * Creates an array of GradedActivity objects
     * @return An array of GradedActivity Objects
     */
    public static GradedActivity[] Polymorphic() {
        GradedActivity[] tests = new GradedActivity[3];

        tests[0] = new GradedActivity();
        tests[0].setScore(95);

        tests[1] = new PassFailExam(20,5,60);

        tests[2] = new FinalExam(50,7);
        return tests;
    }
}

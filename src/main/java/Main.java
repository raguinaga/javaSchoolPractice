public class Main {
    public static void main(String[] args) {

        GradedActivity exam1 = new FinalExam(50,7);
        GradedActivity exam2 = new PassFailActivity(70);
        GradedActivity exam3 = new PassFailExam(100,10,70);

        exam2.setScore(70);
        System.out.println(exam2.getGrade());

    }
}

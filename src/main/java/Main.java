public class Main {
    public static void main(String[] args) {
        CompSciDemo demo = new CompSciDemo();
        CompSciStudent student1 = demo.getCsStudent();

        System.out.println(student1);

        System.out.println("Hours remaining: " +
                student1.getRemainingHours());
    }
}

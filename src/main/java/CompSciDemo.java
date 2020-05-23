public class CompSciDemo {
    // Make a CS student var.
    CompSciStudent csStudent;

    /**
     * This constructor sets up a CS Student
     * object, it's a hacky workaround for the fact that
     * I already have a main method, and I have to create
     * an object to create another object. I could just make a
     * CS student object in the main method but then I would have to
     * replace all the code eventually, this is for now, a more
     * permanent solution.
     */
    public CompSciDemo() {
        //Create a CompSciStudent object
        csStudent = new CompSciStudent("Jennifer" +
                " Haynes", "167W98337", 2015);

        // Set values for student hours
        csStudent.setMathHours(12);
        csStudent.setCsHours(20);
        csStudent.setGenEdHours(40);
    }

    /**
     * Returns a fully set up CS student object
     * @return A ref to a CS Student object
     */
    public CompSciStudent getCsStudent() {
        return csStudent;
    }
}

public abstract class Student {
    private String name;
    private String idNumber;
    private int yearAdmitted;

    /**
     * Sets the name, idNumber, and yearAdmitted fields
     * @param name Name of student
     * @param idNumber ID number of student
     * @param yearAdmitted Year of admittance for student
     */
    public Student(String name, String idNumber, int yearAdmitted){
        this.name = name;
        this.idNumber = idNumber;
        this.yearAdmitted = yearAdmitted;
    }

    /**
     * Overrides the toString method.
     * @return A nicely formatted string with all field info displayed
     */
    @Override
    public String toString(){
        String str;
        str = "Name: " + name
                + "\nID Number: " + idNumber
                + "\nYear Admitted: " + yearAdmitted;
        return str;
    }

    /**
     * An abstract class, make sure to override later!
     * @return The hours remaining for the student.
     */
    public abstract int getRemainingHours();
}

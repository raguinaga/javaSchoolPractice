public class CompSciStudent extends Student{
    //Required hours
    private final int MATH_HOURS = 20;
    private final int CS_HOURS = 40;
    private final int GEN_ED_HOURS = 60;

    //Hours taken
    private int mathHours;
    private int csHours;
    private int genEdHours;

    /**
     * Takes in general student info and passes it to the
     * constructor of the abstract superclass
     * @param name Name of student
     * @param id ID number of student
     * @param year Year student was admitted
     */
    public CompSciStudent(String name, String id, int year) {
        super(name, id, year);
    }

    /**
     * Sets the mathHours field
     * @param mathHours The number of math hours taken so far
     */
    public void setMathHours(int mathHours){
        this.mathHours = mathHours;
    }

    /**
     * Sets the csHours field
     * @param csHours The number of CompSci hours taken so far.
     */
    public void setCsHours(int csHours) {
        this.csHours = csHours;
    }

    /**
     * Sets the genEdHours field
     * @param genEdHours The number of general ed hours taken so far.
     */
    public void setGenEdHours(int genEdHours) {
        this.genEdHours = genEdHours;
    }

    /**
     * Returns the hours remaining to be taken by the student
     * @return The hours remaining.
     */
    @Override
    public int getRemainingHours(){
        int reqHours,       // Total Required hours
            remainingHours; // Remaining Hours

        // Calculate the required hours
        reqHours = MATH_HOURS + CS_HOURS + GEN_ED_HOURS;

        // Calculate the remaining hours
        remainingHours = reqHours - (mathHours + csHours + genEdHours);

        return  remainingHours;
    }

    /**
     * Returns a string containing the student's data.
     * @return A ref to a string.
     */
    @Override
    public String toString(){
        String str;

        str = super.toString() +
                "\nMajor: Computer Science" +
                "\nMath Hours taken: " + mathHours +
                "\nComputer Science hours taken: " + csHours +
                "\nGeneral Ed hours taken: " + genEdHours;

        return str;
    }
}

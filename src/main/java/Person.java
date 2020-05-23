public class Person implements Displayable{
    private String name;

    /**
     * Sets the name field
     * @param name The name of the person
     */
    public Person(String name) {
        this.name = name;
    }

    // display method

    /**
     * Implementation of the Display interface display method
     * Prints out the name of the person.
     */
    @Override
    public void display() {
        System.out.println("My name is " + name);
    }
}

public class Main {
    public static void main(String[] args) {
        // Fun fact, when two objects implement the same interface you
        // can create them using the interface as the variable type.
        // Note that this is mostly useless after Java introduced the var
        // keyword.
        RetailItem item1 = new CompactDisc("New sounds","Jimmi Hendrix",
                12);
        RetailItem item2 = new DvdMovie("Mad Max", 90, 12);
    }
}

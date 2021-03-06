/*
* At its core an interface is like a class that only contains abstract
* methods. An interface cannot be instantiated, it can only be
* implemented by other classes. The classes that implement the interface
*  must override methods of the interface*/
public interface Displayable {

    /**
     * A default method, these methods do NOT have to be overridden in
     * classes that implement the interface
     */
    default void display() {
        System.out.println("This is the default display method.");
    }
}

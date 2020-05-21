public class Rectangle {
    private double length;
    private double width;

    /**
     * Constructor setting the length and width fields
     *
     * @param length The length of the rectangle
     * @param width  The width of the rectangle
     */
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    /**
     * Stores a new length value in the length field
     *
     * @param length The value to store in length
     */
    public void setLength(double length) {
        this.length = length;
    }

    /**
     * Sets the rectangle's width field
     *
     * @param width The value to store in width
     */
    public void setWidth(double width) {
        this.width = width;
    }

    /**
     * Returns the value in the rectangle's length field
     *
     * @return A rectangle object's length
     */
    public double getLength() {
        return length;
    }

    /**
     * Returns a rectangle's width
     *
     * @return Value in the width field
     */
    public double getWidth() {
        return width;
    }

    /**
     * Returns a rectangle's area by multiplying
     * length and width
     *
     * @return The product of length times width
     */
    public double getArea() {
        return length * width;
    }
}

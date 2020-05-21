public class Cube extends Rectangle {
    private final double height;

    /**
     * Sets cube's length width and height fields
     *
     * @param len Cube's length.
     * @param w   Cube's width.
     * @param h   Cube's height.
     */
    public Cube(double len, double w, double h) {
        // Call to the superclass constructor

        super(len, w);

        height = h;
    }

    public double getHeight() {
        return height;
    }

    public double getSurfaceArea() {
        return getArea() * 6;
    }

    public double getVolume() {
        return getArea() * height;
    }
}

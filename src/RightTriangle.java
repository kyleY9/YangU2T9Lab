public class RightTriangle {
    // instance variables
    private double base;
    private double height;

    // constructors
    public RightTriangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    // methods
    public double hypotenuse() {
        return Math.sqrt(Math.pow(base, 2) + Math.pow(height, 2));
    }
}

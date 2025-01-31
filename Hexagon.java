// Hexagon.java
class Hexagon extends Polygon {
    private double side;

    public Hexagon(double side) {
        this.side = side;
    }

    // Getters and Setters
    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    double calculateArea() {
        return ((3 * Math.sqrt(3)) / 2) * side * side;
    }

    @Override
    double calculatePerimeter() {
        return 6 * side;
    }
}

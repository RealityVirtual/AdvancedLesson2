// Pentagon.java
class Pentagon extends Polygon {
    private double side;

    public Pentagon(double side) {
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
        return (Math.sqrt(5 * (5 + 2 * Math.sqrt(5))) * side * side) / 4;
    }

    @Override
    double calculatePerimeter() {
        return 5 * side;
    }
}

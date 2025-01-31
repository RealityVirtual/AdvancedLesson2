// Main.java
public class Main {
    public static void main(String[] args) {
        // Demonstrate Rectangle
        Rectangle rectangle = new Rectangle(5, 10);
        System.out.println("Rectangle Area: " + rectangle.calculateArea());
        System.out.println("Rectangle Perimeter: " + rectangle.calculatePerimeter());

        // Demonstrate Triangle
        Triangle triangle = new Triangle(3, 4, 5);
        System.out.println("Triangle Area: " + triangle.calculateArea());
        System.out.println("Triangle Perimeter: " + triangle.calculatePerimeter());

        // Demonstrate Pentagon
        Pentagon pentagon = new Pentagon(6);
        System.out.println("Pentagon Area: " + pentagon.calculateArea());
        System.out.println("Pentagon Perimeter: " + pentagon.calculatePerimeter());

        // Demonstrate Hexagon
        Hexagon hexagon = new Hexagon(4);
        System.out.println("Hexagon Area: " + hexagon.calculateArea());
        System.out.println("Hexagon Perimeter: " + hexagon.calculatePerimeter());
    }
}

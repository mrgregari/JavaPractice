package ex1;

public class Circle {
    private double radius;
    public Circle(double radius) {
        setRadius(radius);
    }
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
    public double calculateLength() {
        return 2 * Math.PI * radius;
    }
}
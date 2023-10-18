package ex123;

public class Circle extends Shape {
    protected double radius;
    public Circle() {
        this.color = "Black";
        this.filled = false;
        radius = 1;
    }
    public Circle(double radius) {
        this.radius = radius;
        this.color = "Black";
        this.filled = false;
    }
    public Circle(double radius, String color, boolean filled) {
        this.radius = radius;
        this.color = color;
        this.filled = filled;
    }
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
    @Override
    public String toString() {
        return "fist.Shape: circle, radius: " + this.radius + ", color: " + this.color;
    }
}

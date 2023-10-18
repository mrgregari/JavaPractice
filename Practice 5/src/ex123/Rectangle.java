package ex123;

public class Rectangle extends Shape {

    protected double width, length;

    public Rectangle() {
        this.color = "Black";
        this.filled = false;
        width = 1;
        length = 1;
    }

    public Rectangle(double width, double length) {
        this.color = "Black";
        this.filled = false;
        this.width = width;
        this.length = length;
    }
    public Rectangle(double width, double length, String color, boolean filled) {
        this.color = color;
        this.filled = filled;
        this.width = width;
        this.length = length;
    }
    public double getWidth() {
        return width;
    }
    public void setWidth(double width) {
        this.width = width;
    }
    public double getLength() {
        return length;
    }
    public void setLength(double length) {
        this.length = length;
    }
    @Override
    public double getArea() {
        return width * length;
    }

    @Override
    public double getPerimeter() {
        return 2 * (width + length);
    }
    @Override
    public String toString() {
        return "fist.Shape: rectangle, width: " + this.width + ", length: " + this.length + ", color: " + this.color;
    }
}

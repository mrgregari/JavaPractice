package ex123;

public class Square extends Rectangle {
    public Square() {
        this.color = "Black";
        this.filled = false;
        this.width = 1;
        this.length = 1;
    }
    public Square(double side) {
        this.color = "Black";
        this.filled = false;
        this.width = side;
        this.length = side;
    }
    public Square(double side, String color, boolean filled) {
        this.color = color;
        this.filled = filled;
        this.width = side;
        this.length = side;
    }
    public double getSide() {
        return width;
    }
    public void setSide(double side) {
        this.width = side;
        this.length = side;
    }
    @Override
    public void setWidth(double side) {
        this.width = side;
        this.length = side;
    }
    @Override
    public void setLength(double side) {
        this.width = side;
        this.length = side;
    }
    @Override
    public String toString() {
        return "fist.Shape: square, side: " + this.width + ", color: " + this.color;
    }
}

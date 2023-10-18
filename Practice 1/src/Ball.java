public class Ball {
    private String color;
    private int radius;

    public Ball(String color, int radius) {
        this.color = color;
        this.radius = radius;
    }

    public Ball(String color) {
        this.color = color;
        this.radius = 1;
    }

    public Ball(int radius) {
        this.color = "Синий";
        this.radius = radius;
    }

    public Ball() {
        this.color = "Синий";
        this.radius = 1;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return this.color + ", radius " + this.radius;
    }

    public int getDiametr() {
        return radius * 2;
    }
}

package ex1;

public class CircleTest {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        System.out.println("Радиус окружности: " + circle.getRadius());
        System.out.println("Площадь окружности: " + circle.calculateArea());
        System.out.println("Длина окружности: " + circle.calculateLength());
        circle.setRadius(8);
        System.out.println("Новый радиус окружности: " + circle.getRadius());
        System.out.println("Площадь окружности (новый радиус): " + circle.calculateArea());
        System.out.println("Длина окружности (новый радиус): " + circle.calculateLength());
    }
}
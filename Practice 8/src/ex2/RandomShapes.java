package ex2;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

// Абстрактный класс ex2.Shape
abstract class Shape {
    protected Color color;
    protected int x, y;

    public Shape(Color color, int x, int y) {
        this.color = color;
        this.x = x;
        this.y = y;
    }

    // Метод для отрисовки фигуры
    abstract void draw(Graphics g);
}

// Класс для круга
class Circle extends Shape {
    private int radius;

    public Circle(Color color, int x, int y, int radius) {
        super(color, x, y);
        this.radius = radius;
    }

    @Override
    void draw(Graphics g) {
        g.setColor(color);
        g.fillOval(x - radius, y - radius, 2 * radius, 2 * radius);
    }
}

// Класс для прямоугольника
class Rectangle extends Shape {
    private int width, height;

    public Rectangle(Color color, int x, int y, int width, int height) {
        super(color, x, y);
        this.width = width;
        this.height = height;
    }

    @Override
    void draw(Graphics g) {
        g.setColor(color);
        g.fillRect(x, y, width, height);
    }
}

public class RandomShapes extends JPanel {
    private static final int WIDTH = 800;
    private static final int HEIGHT = 600;
    private static final int NUM_SHAPES = 20;

    private Shape[] shapes;

    public RandomShapes() {
        shapes = new Shape[NUM_SHAPES];
        Random random = new Random();

        // Создаем случайные фигуры и добавляем их в массив
        for (int i = 0; i < NUM_SHAPES; i++) {
            int x = random.nextInt(WIDTH);
            int y = random.nextInt(HEIGHT);
            Color color = new Color(random.nextInt(256), random.nextInt(256), random.nextInt(256));

            if (i % 2 == 0) {
                int radius = random.nextInt(50) + 20; // Радиус от 20 до 69
                shapes[i] = new Circle(color, x, y, radius);
            } else {
                int width = random.nextInt(100) + 50; // Ширина от 50 до 149
                int height = random.nextInt(100) + 50; // Высота от 50 до 149
                shapes[i] = new Rectangle(color, x, y, width, height);
            }
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Отрисовка всех фигур
        for (Shape shape : shapes) {
            shape.draw(g);
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Случайные фигуры");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(WIDTH, HEIGHT);

        RandomShapes shapesPanel = new RandomShapes();
        frame.add(shapesPanel);

        frame.setVisible(true);
    }
}

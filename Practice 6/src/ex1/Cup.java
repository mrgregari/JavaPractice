package ex1;

public class Cup extends Dish {
    private int capacity; // Вместимость в миллилитрах

    public Cup(String material, String color, int capacity) {
        super(material, color);
        this.capacity = capacity;
    }

    // Реализация абстрактного метода use для чашки
    @Override
    public void use() {
        System.out.println("Пьем из чашки");
    }

    // Геттер и сеттер для вместимости
    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}
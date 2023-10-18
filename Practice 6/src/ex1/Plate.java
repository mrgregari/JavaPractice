package ex1;

public class Plate extends Dish {
    private boolean microwaveSafe; // Подходит ли для микроволновой печи

    public Plate(String material, String color, boolean microwaveSafe) {
        super(material, color);
        this.microwaveSafe = microwaveSafe;
    }

    // Реализация абстрактного метода use для тарелки
    @Override
    public void use() {
        System.out.println("Кладем еду на тарелку");
    }

    // Геттер и сеттер для свойства microwaveSafe
    public boolean isMicrowaveSafe() {
        return microwaveSafe;
    }

    public void setMicrowaveSafe(boolean microwaveSafe) {
        this.microwaveSafe = microwaveSafe;
    }
}
package ex2;

public class DogTest {
    public static void main(String[] args) {
        Labrador labrador = new Labrador("Барон", 3);
        Bulldog bulldog = new Bulldog("Рекс", 5);

        // Взаимодействие с собаками и вывод информации о них
        System.out.println("Информация о собаках:");
        labrador.bark();
        System.out.println("Возраст лабрадора: " + labrador.getAge() + " лет");

        bulldog.bark();
        System.out.println("Возраст бульдога: " + bulldog.getAge() + " лет");
    }
}
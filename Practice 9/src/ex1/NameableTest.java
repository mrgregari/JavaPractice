package ex1;

public class NameableTest {
    public static void main(String[] args) {
        // Создаем объекты разных классов, реализующих интерфейс Nameable
        Planet earth = new Planet("Earth");
        Car honda = new Car("Honda Civic");
        Animal lion = new Animal("Lion");

        // Вызываем метод getName() для каждого объекта и выводим их имена
        System.out.println("Имя планеты: " + earth.getName());
        System.out.println("Имя машины: " + honda.getName());
        System.out.println("Имя животного: " + lion.getName());
    }
}
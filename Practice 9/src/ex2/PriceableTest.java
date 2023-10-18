package ex2;

public class PriceableTest {
    public static void main(String[] args) {
        // Создаем объекты разных классов, реализующих интерфейс Priceable
        Product laptop = new Product("Laptop", 1200.0);
        Car toyota = new Car("Toyota Camry", 25000.0);
        RealEstate house = new RealEstate("123 Main St", 300000.0);

        // Вызываем метод getPrice() для каждого объекта и выводим их цены
        System.out.println("Цена товара '" + laptop.getName() + "': $" + laptop.getPrice());
        System.out.println("Цена автомобиля '" + toyota.getBrand() + "': $" + toyota.getPrice());
        System.out.println("Цена недвижимости по адресу '" + house.getAddress() + "': $" + house.getPrice());
    }
}

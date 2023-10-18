package ex3;
import java.util.*;
public class FurnitureShop {
    private List<Furniture> inventory;

    public FurnitureShop() {
        inventory = new ArrayList<>();
    }

    // Добавление мебели в инвентарь магазина
    public void addFurniture(Furniture furniture) {
        inventory.add(furniture);
    }

    // Вывод информации о мебели в магазине
    public void displayInventory() {
        System.out.println("Инвентарь магазина мебели:");
        for (Furniture furniture : inventory) {
            System.out.println("Название: " + furniture.getName());
            System.out.println("Цена: " + furniture.getPrice());
            furniture.use();
            System.out.println();
        }
    }

    public static void main(String[] args) {
        FurnitureShop shop = new FurnitureShop();

        Chair chair = new Chair("Стул №1", 50.0, 4);
        Bed bed = new Bed("Кровать King Size", 500.0, "King Size");

        shop.addFurniture(chair);
        shop.addFurniture(bed);

        shop.displayInventory();
    }
}
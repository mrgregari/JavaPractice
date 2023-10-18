package ex1;

public class DishTest {
    public static void main(String[] args) {
        Cup cup = new Cup("Керамика", "Белый", 300);
        Plate plate = new Plate("Порцелян", "Синий", true);

        // Используем посуду и выводим информацию о ней
        System.out.println("Чашка: Материал - " + cup.getMaterial() + ", Вместимость - " + cup.getCapacity() + " мл");
        cup.use();

        System.out.println("Тарелка: Материал - " + plate.getMaterial() + ", Можно использовать в микроволновой - " + plate.isMicrowaveSafe());
        plate.use();
    }
}
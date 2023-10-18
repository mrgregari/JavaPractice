import java.util.Arrays;
import java.util.Random;

public class Main {
    public static int calculateFactorial(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
    public static void main(String[] args) {
        // 1
        int[] numbers = {1, 2, 3, 4, 5};
        int sum = 0;

        // Используем цикл for
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        System.out.println("Сумма (for): " + sum);

        // Используем цикл while
        sum = 0;
        int index = 0;
        while (index < numbers.length) {
            sum += numbers[index];
            index++;
        }
        System.out.println("Сумма (while): " + sum);

        // Используем цикл do while
        sum = 0;
        index = 0;
        do {
            sum += numbers[index];
            index++;
        } while (index < numbers.length);
        System.out.println("Сумма (do while): " + sum);
        System.out.println();
        System.out.println("Аргументы командной строки:");
        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }
        System.out.println();
        // 2
        System.out.println("Первые 10 чисел гармонического ряда:");
        for (int i = 1; i <= 10; i++) {
            double harmonicNumber = 1.0 / i;
            System.out.println(harmonicNumber);
        }
        System.out.println();
        // 3
        int[] randomArray = new int[10];
        Random random = new Random();

        // Заполняем массив случайными числами
        for (int i = 0; i < randomArray.length; i++) {
            randomArray[i] = random.nextInt(100); // Генерируем случайное число от 0 до 99
        }

        // Выводим исходный массив на экран
        System.out.println("Исходный массив:");
        System.out.println(Arrays.toString(randomArray));

        // Сортируем массив
        Arrays.sort(randomArray);

        // Выводим отсортированный массив на экран
        System.out.println("Отсортированный массив:");
        System.out.println(Arrays.toString(randomArray));
        System.out.println();
        // 5
        int n = 5; // Здесь указываем число, для которого нужно вычислить факториал
        int factorial = calculateFactorial(n);
        System.out.println(n + "! = " + factorial);

    }
}
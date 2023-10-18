package ex4;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class AppendToFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите текст для добавления в файл: ");
        String newText = scanner.nextLine();

        try {
            FileWriter fileWriter = new FileWriter("output.txt", true); // Открываем файл для добавления текста (параметр true)
            fileWriter.write(newText); // Записываем новый текст в файл
            fileWriter.close(); // Закрываем FileWriter
            System.out.println("Текст успешно добавлен в файл 'output.txt'");
        } catch (IOException e) {
            System.out.println("Произошла ошибка при записи в файл: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}

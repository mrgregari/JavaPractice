package ex3;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileUpdate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите новую информацию для записи в файл: ");
        String newContent = scanner.nextLine();

        try {
            FileWriter fileWriter = new FileWriter("output.txt"); // Открываем файл для записи

            fileWriter.write(newContent); // Записываем новую информацию в файл
            fileWriter.close(); // Закрываем FileWriter
            System.out.println("Информация успешно обновлена в файле 'output.txt'");
        } catch (IOException e) {
            System.out.println("Произошла ошибка при записи в файл: " + e.getMessage());
        } finally {
            scanner.close(); // Закрываем Scanner
        }
    }
}

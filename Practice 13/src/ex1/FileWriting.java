package ex1;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileWriting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите текст для записи в файл: ");
        String inputText = scanner.nextLine();

        try {
            FileWriter fileWriter = new FileWriter("output.txt"); // Создаем объект FileWriter для записи в файл "output.txt"
            fileWriter.write(inputText); // Записываем введенный текст в файл
            fileWriter.close(); // Закрываем файл после записи
            System.out.println("Текст успешно записан в файл 'output.txt'");
        } catch (IOException e) {
            System.out.println("Произошла ошибка при записи в файл: " + e.getMessage());
        } finally {
            scanner.close(); // Закрываем Scanner
        }
    }
}

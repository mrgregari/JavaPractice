package ex2;

import java.io.FileReader;
import java.io.IOException;

public class FileReading {
    public static void main(String[] args) {
        try {
            FileReader fileReader = new FileReader("output.txt"); // Открываем файл для чтения

            int character;
            while ((character = fileReader.read()) != -1) { // Читаем файл посимвольно
                System.out.print((char) character); // Выводим каждый символ на экран
            }

            fileReader.close(); // Закрываем FileReader
        } catch (IOException e) {
            System.out.println("Произошла ошибка при чтении файла: " + e.getMessage());
        }
    }
}

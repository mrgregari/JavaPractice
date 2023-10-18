package ex3;

public class BookTest {
    public static void main(String[] args) {
        // Создаем экземпляр книги
        Book myBook = new Book("Автор книги", "Название книги", 2023);

        // Выводим информацию о книге
        System.out.println("Автор: " + myBook.getAuthor());
        System.out.println("Название: " + myBook.getTitle());
        System.out.println("Год написания: " + myBook.getYear());

        // Изменяем свойства книги
        myBook.setAuthor("Новый автор");
        myBook.setTitle("Новое название");
        myBook.setYear(2024);

        // Выводим обновленную информацию о книге
        System.out.println("Новый автор: " + myBook.getAuthor());
        System.out.println("Новое название: " + myBook.getTitle());
        System.out.println("Новый год написания: " + myBook.getYear());
    }
}
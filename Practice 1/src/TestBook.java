public class TestBook {
    public static void main(String[] args) {
        Book b1 = new Book();
        b1.setName("Азбука");
        b1.setYear(1900);
        Book b2 = new Book("Дежавю", "Кизару", 2022);
        System.out.println(b1);
        System.out.println(b2);
    }
}

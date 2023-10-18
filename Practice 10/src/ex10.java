import java.util.Scanner;

public class ex10 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(reverse(n, 0));
    }
    public static int reverse(int n, int a) {
        if (n == 0) {
            return a;
        }
        else {
            return reverse(n / 10, 10 * a + n % 10);
        }
    }
}

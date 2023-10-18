import java.util.Scanner;

public class ex9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println(countSequences(a, b));
    }

    public static int countSequences(int a, int b) {
        if (a > b + 1) {
            return 0;
        }
        else if (b == 0 || a == 0) {
            return 1;
        }
        else {
            return countSequences(a, b - 1) + countSequences(a - 1, b - 1);
        }
    }
}

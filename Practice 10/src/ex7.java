import java.util.Scanner;

public class ex7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        printPrimeFactors(n, 2);
    }

    public static void printPrimeFactors(int n, int factor) {
        if (n == 1) {
            return;
        }
        if (n % factor == 0) {
            System.out.print(factor + " ");
            printPrimeFactors(n / factor, factor);
        }
        else {
            printPrimeFactors(n, factor + 1);
        }
    }
}


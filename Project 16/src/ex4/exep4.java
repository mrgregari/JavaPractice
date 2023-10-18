package ex4;

import java.util.Scanner;

/*
И наконец добавьте блок finally к решению Задания №2.
Повторно запустите программу, чтобы проверить ее поведение. Объясните новое поведение программы

 */
public class exep4 {
    public void exceptionDemo() {
        try {
            Scanner myScanner = new Scanner(System.in);
            System.out.print("Enter an integer ");
            String intString = myScanner.next();
            int i = Integer.parseInt(intString);
            System.out.println(2 / i);
        }catch(Exception e) {
            System.out.println("Exception happened!");
        }
//        catch (NumberFormatException e){             // Compile error: NumberFormatException already catched
//            System.out.println("Not correct number");
//        }
        finally {
            System.out.println("finally");
        }
    }

    public static void main(String[] args) {
        exep4 e2 = new exep4();
        e2.exceptionDemo();
    }
}
package ex1;

public class exep1 {
    public void exceptionDemo(){
        System.out.println(2/0);
    }
    public void exceptionDemo2(){
        try{
            System.out.println( 2 / 0 );
        } catch ( ArithmeticException e ) {
            System.out.println("Attempted division by zero");
        }
    }

    public static void main(String[] args) {
        exep1 e1 = new exep1();
        e1.exceptionDemo2();
        e1.exceptionDemo();

    }
}
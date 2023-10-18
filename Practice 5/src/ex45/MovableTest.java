package ex45;

public class MovableTest {
    public static void main(String[] args) {
        Movable shape = new MovablePoint(0, 0, 5, 1);
        System.out.println("Point:\n");
        System.out.println(shape);
        shape.moveUp();
        shape.moveLeft();
        System.out.println("Up+Left -> " + shape);

        System.out.println("\nCircle:\n");
        shape = new MovableCircle(0, 0, 1, 5, 3);
        System.out.println(shape);
        shape.moveDown();
        shape.moveRight();
        System.out.println("Down + Right -> " + shape);

        System.out.println("\nRectangle:\n");
        shape = new MovableRectangle(0, 0, 5, 5, 3,6);
        System.out.println(shape);
        shape.moveRight();
        shape.moveUp();
        System.out.println("Right+Up -> " + shape);

        System.out.println("\nSetting wrong speed:");
        MovableRectangle rect = (MovableRectangle)shape;
        rect.setWrongSpeed(0, 10);
        try {
            rect.moveDown();
        } catch (IllegalStateException ex){
            System.out.println(ex);
        }
    }
}

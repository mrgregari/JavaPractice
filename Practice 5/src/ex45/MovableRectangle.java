package ex45;

public class MovableRectangle implements Movable{
    MovablePoint topLeft;
    MovablePoint bottomRight;
    public MovableRectangle(int x1, int y1, int x2, int y2, int xSpeed, int ySpeed) {
        topLeft = new MovablePoint(x1, y1, xSpeed, ySpeed);
        bottomRight = new MovablePoint(x2, y2, xSpeed, ySpeed);
    }
    public void setWrongSpeed(int xSpeed, int ySpeed) {
        topLeft.xSpeed = xSpeed;
        topLeft.ySpeed = ySpeed;
    }
    public boolean isWrongSpeed() {
        return topLeft.xSpeed != bottomRight.xSpeed || topLeft.ySpeed != bottomRight.ySpeed;
    }
    @Override
    public void moveUp() {
        if (isWrongSpeed()) throw new IllegalStateException("Скорости точек прямоугольника не совпадают. topLeft: " +
                "xSpeed = " + this.topLeft.xSpeed + ", ySpeed = " + this.topLeft.ySpeed + ", bottomRight: " +
                "xSpeed = " + this.bottomRight.xSpeed + ", ySpeed = " + this.bottomRight.ySpeed);
        topLeft.moveUp();
        bottomRight.moveUp();
    }

    @Override
    public void moveDown() {
        if (isWrongSpeed()) throw new IllegalStateException("Скорости точек прямоугольника не совпадают. topLeft: " +
                "xSpeed = " + this.topLeft.xSpeed + ", ySpeed = " + this.topLeft.ySpeed + ", bottomRight: " +
                "xSpeed = " + this.bottomRight.xSpeed + ", ySpeed = " + this.bottomRight.ySpeed);
        topLeft.moveDown();
        bottomRight.moveDown();
    }

    @Override
    public void moveLeft() {
        if (isWrongSpeed()) throw new IllegalStateException("Скорости точек прямоугольника не совпадают. topLeft: " +
                "xSpeed = " + this.topLeft.xSpeed + ", ySpeed = " + this.topLeft.ySpeed + ", bottomRight: " +
                "xSpeed = " + this.bottomRight.xSpeed + ", ySpeed = " + this.bottomRight.ySpeed);
        topLeft.moveLeft();
        bottomRight.moveLeft();
    }

    @Override
    public void moveRight() {
        if (isWrongSpeed()) throw new IllegalStateException("Скорости точек прямоугольника не совпадают. topLeft: " +
                "xSpeed = " + this.topLeft.xSpeed + ", ySpeed = " + this.topLeft.ySpeed + ", bottomRight: " +
                "xSpeed = " + this.bottomRight.xSpeed + ", ySpeed = " + this.bottomRight.ySpeed);
        topLeft.moveRight();
        bottomRight.moveRight();

    }
    @Override
    public String toString() {
        return "MovableRectangle: topLeft = MovablePoint (x = " + this.topLeft.x + ", y = "+ this.topLeft.y +
                "), bottomRight = MovablePoint (x = " + this.bottomRight.x +
                ", y = " + this.bottomRight.y + "), xSpeed = " + this.topLeft.xSpeed +
                ", ySpeed = " + this.topLeft.ySpeed;
    }
}

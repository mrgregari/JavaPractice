public class TestBall {
    public static void main(String[] args) {
        Ball b1 = new Ball();
        b1.setColor("Фиолетовый");
        Ball b2 = new Ball("Жёлтый", 30);
        Ball b3 = new Ball(22);
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
        System.out.println("Ball diametr = " + b3.getDiametr());
    }
}

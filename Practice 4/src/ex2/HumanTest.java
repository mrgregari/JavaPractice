package ex2;

public class HumanTest {
    public static void main(String[] args) {
        Head head = new Head("Шатен", "Карие");
        Leg leftLeg = new Leg(80); // Размер ноги в см
        Leg rightLeg = new Leg(80);
        Hand leftHand = new Hand(5); // Количество пальцев на руке
        Hand rightHand = new Hand(5);

        Human human = new Human(head, leftLeg, rightLeg, leftHand, rightHand);

        human.speak();
        human.walk();
        human.useHands();
    }
}
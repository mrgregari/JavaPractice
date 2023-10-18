package ex2;

class Human {
    private Head head;
    private Leg leftLeg;
    private Leg rightLeg;
    private Hand leftHand;
    private Hand rightHand;

    public Human(Head head, Leg leftLeg, Leg rightLeg, Hand leftHand, Hand rightHand) {
        this.head = head;
        this.leftLeg = leftLeg;
        this.rightLeg = rightLeg;
        this.leftHand = leftHand;
        this.rightHand = rightHand;
    }

    public void speak() {
        System.out.println("Человек говорит.");
        head.talk();
    }

    public void walk() {
        System.out.println("Человек идет.");
        leftLeg.walk();
        rightLeg.walk();
    }

    public void useHands() {
        System.out.println("Человек использует руки.");
        leftHand.grab();
        rightHand.grab();
    }
}
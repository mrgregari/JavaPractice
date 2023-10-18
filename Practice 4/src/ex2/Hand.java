package ex2;

class Hand {
    private int fingers; // Количество пальцев на руке

    public Hand(int fingers) {
        this.fingers = fingers;
    }

    public int getFingers() {
        return fingers;
    }

    public void grab() {
        System.out.println("Рука хватает.");
    }
}

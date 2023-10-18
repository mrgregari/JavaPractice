package ex2;

class Leg {
    private int size; // Размер ноги в сантиметрах

    public Leg(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public void walk() {
        System.out.println("Нога идет.");
    }
}

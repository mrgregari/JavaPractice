package ex2;

public class Client {
    public Chair chair;
    public void sit() {
        System.out.println("Client sat!");
    }
    public void setChair(Chair chair) {
        this.chair = chair;
    }
}
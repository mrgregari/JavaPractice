package ex3;

public class Bed extends Furniture {
    private String bedSize;

    public Bed(String name, double price, String bedSize) {
        super(name, price);
        this.bedSize = bedSize;
    }

    @Override
    public void use() {
        System.out.println("Спим на кровати " + getName());
    }

    public String getBedSize() {
        return bedSize;
    }

    public void setBedSize(String bedSize) {
        this.bedSize = bedSize;
    }
}
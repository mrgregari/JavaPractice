package ex2;

class Head {
    private String hairColor; // Цвет волос
    private String eyeColor;  // Цвет глаз

    public Head(String hairColor, String eyeColor) {
        this.hairColor = hairColor;
        this.eyeColor = eyeColor;
    }

    public String getHairColor() {
        return hairColor;
    }

    public String getEyeColor() {
        return eyeColor;
    }

    public void talk() {
        System.out.println("Голова говорит.");
    }
}
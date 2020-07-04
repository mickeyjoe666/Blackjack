package Card;

public enum CardColor {

//    Heart("heart"),Diamond("diamond"),Club("club"),Black("black");
    Heart("\u2663"),Diamond("\u2666"),Club("\u2665"),Black("\u2660");

    private String color;

    private CardColor(String color) {

        this.color = color;
    }

    public String getColor() {

        return color;
    }

    public void setColor(String color) {

        this.color = color;
    }

//    Heart, Diamond, Club, Black
}

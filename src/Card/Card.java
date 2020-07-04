package Card;

public class Card {
    private String num;
    private String color;

    public Card(){

    }

    public Card(String num, String color){
        this.num = num;
        this.color = color;
    }

    public String toString(){
        return num + color;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {

        this.num = num;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {

        this.color = color;
    }
}

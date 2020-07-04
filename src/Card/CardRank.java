package Card;

public enum CardRank {
    Ace("A"),Two("2"),Three("3"),Four("4"),Five("5"),Six("6"),
    Seven("7"),Eight("8"),Nine("9"),Ten("10"),Jack("J"),Queen("Q"),King("K");
    // 成员变量
    private String num;

    // 构造方法
    private CardRank(String num) {
        this.num = num;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }
}

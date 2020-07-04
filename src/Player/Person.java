package Player;

import Card.Card;
import Exception.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Person {
    public String name;
    public int score;
    public ArrayList <Card> card_own = new ArrayList<Card>();
    public boolean burst;
    public Person(){

    }

    public Person (String name, int score){
        this.name = name;
        this.score = score;
    }


    @Override
    public String toString() {
        return "Person{" +
                "name is ='" + name + '\'' +
                ", score is =" + score +
                '}';
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public boolean askOrNot() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("playerはカードを引きますか？(y/n) =>");
        String answer = scanner.next();
        boolean willHit = answer.equalsIgnoreCase("y");
        return willHit;
    }

    //ask new card
    public void askCard(Card card){
        this.card_own.add(card);
    }

    //show card owned by person
    public void showCard(){
        System.out.print(this.name + "'s card is ");
        for(Card cardOwnByPerson : card_own){
            System.out.print( cardOwnByPerson.getColor() + cardOwnByPerson.getNum() + " ");
        }
        System.out.println("\n");
    }



    //calculate the score
    public void calculateScore() throws BustException {
//        this.showCard();
        for(Card cardOwnByPerson : card_own){
            if(cardOwnByPerson.getNum() == "A"){
                if(this.getScore() + 11 > 21){
                    this.setScore(this.getScore() + 1);
                }else{
                    this.setScore(this.getScore() + 11);
                }
            }else if(cardOwnByPerson.getNum()=="J" || cardOwnByPerson.getNum()=="Q" || cardOwnByPerson.getNum()=="K" || cardOwnByPerson.getNum()=="10"){
                this.setScore(this.getScore() + 10);
            }else{
                this.setScore(this.getScore() + Integer.parseInt(cardOwnByPerson.getNum()));
            }

        }

        if(this.getScore() > 21){
//            throw new BustException(this.getName());
            System.out.println(this.name + " busted!!! Game is over!!");
            this.burst = true;
//            System.exit(1);
        }
        System.out.println(this.name + " 's score is " + score);

    }
}

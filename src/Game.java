import Card.Card;
import Card.CardColor;
import Card.Deck;
import Player.Player;
import Player.Dealer;
import Exception.*;
public class Game {
    public static void start (String playerName, String dealerName){
        int position = 0;
        int score = 0;
        Deck deck =  new Deck();

        deck.shuffle();

//        Card card[] = new Card[52];
//        card = deck.getCard();
//
//        for(Card simple : card){
//            System.out.println(simple.getColor());
//        }


        Player newPlayer = new Player(playerName, score);
        Dealer newDealer = new Dealer(dealerName, score);


        //first time
        newDealer.askCard(deck.getCard(position));
        position += 1;
        newPlayer.askCard(deck.getCard(position));
        position += 1;

        //second time
        newDealer.askCard(deck.getCard(position));
        position += 1;
        newPlayer.askCard(deck.getCard(position));
        position += 1;
        newPlayer.showCard();

        try {
            newPlayer.calculateScore();
            System.out.println("********************************");
            newDealer.calculateScore();
        } catch (BustException e) {
            e.printStackTrace();
        }

        System.out.println("********************************");
        boolean playerWillAsk = true;
        boolean dealerWillAsk = true;
        while (playerWillAsk == true || dealerWillAsk == true) {
            System.out.println("player choice");
            if (playerWillAsk) {
                playerWillAsk = newPlayer.askOrNot();
                if (playerWillAsk) {
                    Card card = deck.getCard(position);
                    newPlayer.askCard(card);
                    System.out.println("player card is " + card.getColor()+card.getNum());
                    position += 1;
                }
            }

            System.out.println("dealer choice");
            if (dealerWillAsk) {
                dealerWillAsk = newDealer.askOrNot();
                if (dealerWillAsk) {
                    Card card = deck.getCard(position);
                    newDealer.askCard(card);
                    System.out.println("dealer card is " + card.getColor()+card.getNum());
                    position += 1;
                }
            }
            System.out.println("*------------finsh-------------*");
            newPlayer.showCard();
            newPlayer.setScore(0);
            newDealer.setScore(0);
            try {
                newPlayer.calculateScore();
            } catch (BustException e) {
//                e.printStackTrace();
                e.getMessage();
            }
            System.out.println("********************************");
            try {
                newDealer.calculateScore();
            } catch (BustException e) {
//                e.printStackTrace();
                e.getMessage();
            }

            if(newPlayer.burst && newDealer.burst){
                System.out.println("All burst. Dealer win!!");
                System.exit(1);
            }else if(newPlayer.burst || newDealer.burst){
                System.out.println("");
                System.exit(1);
            }

        }

        System.out.println("********************************");

        Referee referee = new Referee();

        referee.showResult(newPlayer, newDealer);

        System.out.println("********************************");
    }
}

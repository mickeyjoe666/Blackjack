import Card.Card;
import Card.CardColor;
import Card.Deck;
import Player.Player;

import java.util.EnumSet;
import java.util.Scanner;

public class PlayGame {

    public static void main(String[] args) {
        String playerName = "player";
        String dealerName = "dealer";


//        Scanner scan1 = new Scanner(System.in);
//        System.out.println("Please enter player name ：");
//        if (scan1.hasNextLine()) {
//            playerName = scan1.nextLine();
//
//        }
//
//
//
//        Scanner scan2 = new Scanner(System.in);
//        System.out.println("Please enter dealer name ：");
//        if (scan2.hasNextLine()) {
//            dealerName = scan2.nextLine();
//
//        }
//        System.out.println("Player name is ：" + playerName);
//        System.out.println("Dealer name is ：" + dealerName);
        System.out.println("********************************");

        try {
            Game.start(playerName, dealerName);
        } catch (Exception e) {
            e.printStackTrace();
        }



//        for(CardColor color : CardColor.values()){
//            System.out.println(color.getColor());
//        }






    }
}

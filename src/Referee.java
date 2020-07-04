import Player.Player;
import Player.Dealer;

public class Referee {

    public Referee(){

    }

    public void showResult(Player player, Dealer dealer){
        int playerScore = 21 - player.getScore();
        int dealerScore = 21 - dealer.getScore();
        if(playerScore == dealerScore){
            System.out.println("It is a tie game");
        }else if(playerScore < dealerScore){
            System.out.println("Player :" + player.getName() + " win!!");
        }else{
            System.out.println("Dealer :" + dealer.getName() + " win!!");
        }

    }
}

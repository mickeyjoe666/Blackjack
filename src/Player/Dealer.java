package Player;

import Card.Card;
import Exception.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Dealer extends Person{

    public Dealer(){

    }

    public Dealer(String name, int score){
        this.name = name;
        this.score = score;
    }




    //check dealer score over 17 or not
    public boolean checkOverLimmit(){
        boolean overSeventeen;


        if(this.score > 17 ){
            overSeventeen = true;
            return overSeventeen;
        }else{
            overSeventeen = false;
            return overSeventeen;
        }
    }



    public boolean askOrNot() {
        boolean willHit = true;
        if (this.checkOverLimmit()){
            Scanner scanner = new Scanner(System.in);
            System.out.print("ディーラーはカードを引きますか？(y/n) =>");
            String answer = scanner.next();
             willHit = answer.equalsIgnoreCase("y");
            return willHit;
        }else{
            return willHit;
        }

    }
}

package Card;

import java.util.*;

public class Deck {
    //one deck has 52 card
    private Card[] deck = new Card[52];

    public Deck (){
        for(int i = 0; i < deck.length; ){
            for(CardRank rank : CardRank.values()){
                for (CardColor color : CardColor.values()){
                    deck[i] = new Card();
                    deck[i].setColor(color.getColor());
                    deck[i].setNum(rank.getNum());
                    i++;
                }
            }
        }

    }

    //shuffle the deck when the game begin and end
    public void shuffle(){
        List<Card> list =Arrays.asList(deck);
        Collections.shuffle(list);
        list.toArray(deck);

    }

    public Card[] getCard() {
        return deck;
    }
    public Card getCard(int position ){
        Card card = new Card();
        card.setNum(deck[position].getNum());
        card.setColor(deck[position].getColor());
        return card;

    }

}




















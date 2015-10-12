package klondike;

import java.util.ArrayList;

public class Deck {
	
	private static final int DECK = 52;
	
	private static final int NUMOFSUITS = 4;
	
	private ArrayList<Card> card = new ArrayList<Card>(DECK);
	
	private ArrayList<Card> discard = new ArrayList<Card>();
	
	private ArrayList<TypeofSuit> totalsuites = new ArrayList<TypeofSuit>(NUMOFSUITS);
	
	public Deck deck;
		
	public Deck(){
		createSuits();
		createCards();
	}
	
	private void createSuits(){
		totalsuites.add(new TypeofSuit(Suit.CLUB,Color.BLACK));
		totalsuites.add(new TypeofSuit(Suit.SPADE,Color.BLACK));
		totalsuites.add(new TypeofSuit(Suit.DIAMOND,Color.RED));
		totalsuites.add(new TypeofSuit(Suit.HEART,Color.RED));
	}
	
	private void createCards(){
		for(int i=0; i<Deck.NUMOFSUITS;i++){
			for(int j=0; j<13; j++){
				card.add(new Card(j,totalsuites.get(i)));
			}
		}
	}
	
    public  ArrayList<Card> shuffle() {
        ArrayList<Card> temp = new ArrayList<Card>();
        while(!card.isEmpty()) {
            int loc=(int)(Math.random()*card.size());
            temp.add(card.get(loc));
            card.remove(loc);   
        }
        return card = temp;
    }
	
    public  ArrayList<Card> getCards() {
    	return this.card;
    }
    
    public  ArrayList<Card> getDiscard() {
    	return this.discard;
    }
    
    public ArrayList<TypeofSuit> getSuits(){
    	return this.totalsuites;
    }
    
    public void movetoDiscard(){
    	int index = 0;
		while(index<3 && card.size()>0){
			discard.add(card.get(0));
			card.remove(0);
			index++;
		}
    }
    
    public void movetoDeck(){
    	for(int i = 0; i < discard.size(); i++){
    		card.add(discard.get(i));
    	}
    }
    
}

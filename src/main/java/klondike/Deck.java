package klondike;

import java.util.ArrayList;

public class Deck {
	
	private static final int DECK = 52;
	
	private static final int NUMOFSUITS = 4;
	
	private ArrayList<Card> card = new ArrayList<Card>(DECK);
	
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
	
}

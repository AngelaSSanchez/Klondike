package klondike;

public abstract class Controller {
	
	protected Deck deck;
	
	protected Controller(Deck deck){
		assert deck != null;
		this.deck = deck;
	}
	
	public Deck getDeck(){
		return this.deck;
	}

}

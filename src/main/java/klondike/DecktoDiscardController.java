package klondike;

public class DecktoDiscardController extends MoveController{

	protected DecktoDiscardController(Deck deck) {
		super(deck);
	}
	
	public void movetoDiscard(){
		this.deck.movetoDiscard();
	}

}

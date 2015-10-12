package klondike;

public class DiscardtoDeckController extends MoveController{

	protected DiscardtoDeckController(Deck deck) {
		super(deck);
	}

	public void movetoDeck(){
		this.deck.movetoDeck();
	}
}

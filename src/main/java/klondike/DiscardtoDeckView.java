package klondike;

public class DiscardtoDeckView{
	
	private DiscardtoDeckController discardtodeck;

	public DiscardtoDeckView(DiscardtoDeckController discardtodeck) {
		this.discardtodeck = discardtodeck;
	}
	
	public void render() {
		IO io = new IO();
		if (!discardtodeck.getDeck().getCards().isEmpty()){
			io.write("Todavia hay cartas en la baraja");
		}
		else{
			discardtodeck.movetoDeck();
		}
		
	}

}

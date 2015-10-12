package klondike;

public class DecktoDiscardView{
	
	private DecktoDiscardController decktodiscard;

	public DecktoDiscardView(DecktoDiscardController decktodiscard) {
		this.decktodiscard = decktodiscard;
	}

	public void render() {
		IO io = new IO();
		if (decktodiscard.getDeck().getCards().isEmpty()){
			io.writeln("No hay más cartas en la baraja");
		}
		else{
			decktodiscard.movetoDiscard();
		}
	}
	
	

}

package klondike;

public class DeckView {

	Deck deck;
	
	public DeckView(Deck deck){
		this.deck = deck;
	}
	
	public void render(){
		IO io = new IO();
		io.writeln("=========================");
		if (!deck.getCards().isEmpty()){
			io.write("Baraja: [X,X]");
		}
		else{
			io.write("<vacio>");
		}
		io.writeln("Descarte: ");
		if (!deck.getDiscard().isEmpty()){
			int index = 0;
			while(index<3 && !deck.getDiscard().isEmpty()){
				io.write("["+deck.getDiscard().get(index).getNumber()+","+deck.getDiscard().get(index).getTypeofSuit().getSuit()+"]");
				index++;
			}
		}
		else{
			io.write("<vacio>");
		}
	}
}

package klondike;

public class TypeofSuit {
	
	public Suit suit;
	public Color color;

	public TypeofSuit(Suit s, Color c){
		this.suit = s;
		this.color = c;
	}
	
	public char getSuit(){
		return this.suit.getValue();
	}
	
	public char getColor(){
		return this.color.getValue();
	}
}

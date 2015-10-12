package klondike;


public class Card {
	
	private int number;
	private TypeofSuit typeofsuit;
	
	public Card(int number, TypeofSuit typeofSuit){
		this.number = number;
		this.typeofsuit = typeofSuit;
	}

	
	public int getNumber(){
		return this.number;
	}
	
	public TypeofSuit getTypeofSuit(){
		return this.typeofsuit;
	}
}

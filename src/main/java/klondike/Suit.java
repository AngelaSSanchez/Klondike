package klondike;

public enum Suit {

	CLUB('t'),
	DIAMOND('d'),
	HEART('c'),
	SPADE('p');
	
	private char value;
	
	private Suit(char value){
		this.value = value;
	}
	
	public char getValue(){
		return this.value;
	}
}

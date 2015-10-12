package klondike;

public enum Color {

	BLACK('b'),
	RED('r');
	
	private char value;
	
	private Color(char value){
		this.value = value;
	}
	
	public char getValue(){
		return this.value;
	}
}

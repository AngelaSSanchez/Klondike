package klondike;


public class Klondike {

	private Deck deck;
	
	private MoveController controller;
	
	private MenuController menucontroller;
	
	private MenuView menuview;
	
	public Klondike(){
		deck = new Deck();
		controller = new MoveController(deck);
		menucontroller = new MenuController(deck);
		menuview = new MenuView(menucontroller);
	}
	
	public void play() {
		menuview.render();
	}

	public static void main(String[] args) {
		new Klondike().play();
	}	
}

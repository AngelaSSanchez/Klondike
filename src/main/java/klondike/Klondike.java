package klondike;


public class Klondike {

	private Deck deck;
	
	private MoveController controller;
	
	private MenuController menucontroller;
	
	private MenuView menuview;
	
	private MoveView moveview;
	
	
	
	public Klondike(){
		deck = new Deck();
		controller = new MoveController(deck);
		menucontroller = new MenuController(deck);
		menuview = new MenuView(menucontroller);
		moveview = new MoveView(controller);
	}
	
	public void play() {
		menuview.render();
		moveview.render();
	}

	public static void main(String[] args) {
		new Klondike().play();
	}	
}

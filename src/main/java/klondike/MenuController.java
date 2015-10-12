package klondike;

public class MenuController extends Controller{
	
	MoveController movecontroller;

	protected MenuController(Deck deck) {
		super(deck);
		movecontroller = new MoveController(deck);
	}
	
	public void setOption(int option){
		this.movecontroller.setOption(option);
	}

}

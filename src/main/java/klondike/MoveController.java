package klondike;

public class MoveController extends Controller{
	
	private int option;
	
	private MoveController[] move;
	
	protected MoveController(Deck deck){
		super(deck);
		setControllers();
	}
	
	public void setOption(int option){
		this.option = option;
	}
	
	private void setControllers(){
		move[0] = new DecktoDiscardController(deck);
		move[1] = new DiscardtoDeckController(deck);
		move[2] = new DiscardtoSuitController(deck);
		move[3] = new DiscardtoStairController(deck);
		move[4] = new StairtoSuitController(deck);
		move[5] = new StairtoStairController(deck);
		move[6] = new SuittoStairController(deck);
		move[7] = new TurninStairController(deck);
	}

	public MoveController getController(){
		return move[this.option];
	}
	
	public View recibir(View moveView){
		return moveView;
	}
	
}

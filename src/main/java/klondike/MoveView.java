package klondike;

public class MoveView implements View{
	
	private MoveController moveController;
	
	public MoveView(MoveController moveController){
		this.moveController = moveController;
	}

	@Override
	public void render() {
		do {
			if (moveController.getController() != null) {
				moveController.getController().recibir(this);
			}
		} while (moveController != null);		
	}

	@Override
	public void attend(DecktoDiscardController decktodiscard) {
		new DecktoDiscardView(decktodiscard).render();		
	}

	@Override
	public void attend(DiscardtoDeckController discardtodeck) {
		new DiscardtoDeckView(discardtodeck).render();
	}

	@Override
	public void attend(DiscardtoStairController discardtostair) {
		new DiscardtoStairView(discardtostair).render();
		
	}

	@Override
	public void attend(DiscardtoSuitController discardtosuit) {
		new DiscardtoSuitView(discardtosuit).render();
	}

	@Override
	public void attend(StairtoStairController stairtostair) {
		new StairtoStairView(stairtostair).render();
	}

	@Override
	public void attend(StairtoSuitController stairtosuit) {
		new StairtoSuitView(stairtosuit).render();
	}

	@Override
	public void attend(SuittoStairController suittostair) {
		new SuittoStairView(suittostair).render();
	}

	@Override
	public void attend(TurninStairController turninstair) {
		new TurninStairView(turninstair).render();
	}

}

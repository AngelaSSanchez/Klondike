package klondike;

public interface View {
	
	void render();

	void attend(DecktoDiscardController decktodiscard);
	
	void attend(DiscardtoDeckController discardtodeck);
	
	void attend(DiscardtoStairController discardtostair);
	
	void attend(DiscardtoSuitController discardtosuit);
	
	void attend(StairtoStairController stairtostair);
	
	void attend(StairtoSuitController stairtosuit);
	
	void attend(SuittoStairController suittostair);
	
	void attend(TurninStairController turninstair);
	
}

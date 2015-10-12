package klondike;


public class MenuView{
	
	private static final int NUMOPTION = 9;
	
	private MenuController menucontroller;
	private int option;
	private IO io;
	
	public MenuView(MenuController menucontroller){
		this.menucontroller = menucontroller;
	}
	
	public void render(){
		do{
			printMenu();
			int option = new LimitedIntDialog("Opcion?", 1,MenuView.NUMOPTION).read();
			if (option == MenuView.NUMOPTION) {
				io.writeln("Adios!!!");
				System.exit(0);
			}
			menucontroller.setOption(option);
			new DeckView(menucontroller.getDeck()).render();
           
		}while(option != 0);
	}
	
	private void printMenu(){
		io = new IO();
		io.writeln("---------------------------------");
		io.writeln("1. Mover de baraja a descarte");
		io.writeln("2. Mover de descarte a baraja");
		io.writeln("3. Mover de descarte a palo");
		io.writeln("4. Mover de descarte a escalera");
		io.writeln("5. Mover de escalera a palo");
		io.writeln("6. Mover de escalera a escalera");
		io.writeln("7. Mover de palo a escalera");
		io.writeln("8. Voltear en escalera");
		io.writeln("9. Salir");
	}
	
}

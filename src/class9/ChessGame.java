package class9;

public class ChessGame {

	public static void main(String[] args) {
		ChessPlayer ann = new ChessPlayer("Ann");
		ChessPlayer bokin = new ChessPlayer("Bokin");
		ann.setOpponent(bokin);
		bokin.setOpponent(ann);
		bokin.setTurn(true);
		Thread bokinGame = new Thread(() -> bokin.play());
		Thread annGame = new Thread(() -> ann.play());
		bokinGame.start();
		annGame.start();

	}

}

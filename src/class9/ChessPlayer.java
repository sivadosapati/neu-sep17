package class9;

public class ChessPlayer extends Person {

	private ChessPlayer opponent;
	boolean myTurn = false;
	boolean gameOver = false;

	public ChessPlayer(String name) {
		super(name);
	}

	public void setTurn(boolean b) {
		this.myTurn = b;
	}

	public void setOpponent(ChessPlayer cp) {
		this.opponent = cp;
	}

	private void checkIfGameOver() {

	}

	public void play() {
		while (true) {

			if (myTurn) {
				System.out.println(name + " is thinking for a move @ " + getTime());
				sleep(getRandom(5000));
				System.out.println(name + " has made a move @ " + getTime());
				checkIfGameOver();
				if (gameOver == true)
					break;
				myTurn = false;
				opponent.setTurn(true);
				synchronized (opponent) {
					opponent.notify();
				}
			} else {

				try {
					synchronized (this) {
						System.out.println(name + " is waiting for turn");
						wait();
					}
				} catch (Exception e) {
				}
			}
		}
		System.out.println("Game over");
	}

}

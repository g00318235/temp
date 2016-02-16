
public class GameRunner implements Runnable {
	GameBoard gameBoard;
	int delay = 1000/80;
	public GameRunner (GameBoard gameBoard){
		this.gameBoard = gameBoard;
	}
	public void run () {
		try {
			while (true){
				gameBoard.moveAll();
				Thread.sleep(delay);
			}
		} catch (InterruptedException e) {
			System.out.println("Game Runner Thread stopped");
		}
	}
}

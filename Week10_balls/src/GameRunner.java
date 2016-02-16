
public class GameRunner implements Runnable{
	GameBoard gameBoard;

	public GameRunner(GameBoard theGameBoard){
		this.gameBoard = theGameBoard;
	}

	public void run(){
		@SuppressWarnings("unused")
		int waitTime = 1000/60;

		try{
			while (true){
				gameBoard.moveAll();

				Thread.sleep(1000/60);
			}
		}catch (InterruptedException e){


		}
	}

}

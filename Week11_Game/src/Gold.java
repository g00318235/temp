
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Polygon;
import java.util.Random;
import java.util.Set;

public class Gold  extends Polygon implements Actor{

	GameBoard gameBoard;

	static final int[] initxPoints = {0,5,5,0};
	static final int[] inityPoints = {0,0,5,5};

	public Gold(GameBoard gameBoard){
		super(initxPoints,inityPoints, inityPoints.length);
		this.gameBoard = gameBoard;

		Random randomGenerator = new Random();

		int xPos = randomGenerator.nextInt(gameBoard.initialGameWidth); 
		int yPos = randomGenerator.nextInt(gameBoard.initialGameHeight); 

		this.translate(xPos, yPos);
	}

	@Override
	public boolean move() {
		for (int i = 0 ; i< xpoints.length ;i++){
			if (gameBoard.ship.contains((double)xpoints[i],(double)ypoints[i])){
				gameBoard.gotGold(this);
				return false;
			}
		}
		return true;
	}

	@Override
	public void draw(Graphics2D g) {
		g.setColor(new Color (255,255,0));
		g.fillPolygon(this);
	}

	@Override
	public void move(Set<Actor> allActors) {
		// TODO Auto-generated method stub
		
	}

}

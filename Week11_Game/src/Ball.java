import java.awt.Color;
import java.awt.Graphics2D;
import java.util.Random;
import java.util.Set;

public class Ball extends java.awt.geom.Ellipse2D.Double implements Actor {


	private static final Color [] colors = {Color.blue,
			Color.cyan,
			Color.GRAY,
			Color.green,
			Color.MAGENTA,
			Color.ORANGE,
			Color.PINK,
			Color.RED
	};
	

	GameBoard gameBoard;
	double size;
	double vx, absVx;
	double vy, absVy;


	private Color color;

	public Ball(GameBoard gameBoard) {
		super();
		this.gameBoard = gameBoard;
		color = Color.red;
		Random randomGenerator = new Random();
		this.size = 30 + randomGenerator.nextDouble()*70;
		this.width = this.size;
		this.height = this.size;

		//this.x=randomGenerator.nextDouble()*(gameBoard.initialGameWidth+this.size);
		//this.y=randomGenerator.nextDouble()*(gameBoard.initialGameHeight+this.size);

		if (randomGenerator.nextInt(2) ==0){
			this.x = randomGenerator.nextInt(2)* (gameBoard.initialGameWidth+this.size)-this.size;
			this.y = randomGenerator.nextDouble()* (gameBoard.initialGameHeight-this.size);

		}else{
			this.x = randomGenerator.nextDouble()* (gameBoard.initialGameWidth-this.size);
			this.y = randomGenerator.nextInt(2)* (gameBoard.initialGameHeight+this.size)-this.size;

		}

		absVx = gameBoard.MAXBALLSPEED * randomGenerator.nextDouble();
		vx = absVx * (-1 + (randomGenerator.nextInt(2)*2)); 
		absVy = gameBoard.MAXBALLSPEED * randomGenerator.nextDouble();
		vy = absVy * (-1 + (randomGenerator.nextInt(2)*2)); 

		color = colors[randomGenerator.nextInt(colors.length)];
		gameBoard.balls.add(this);
	}	

	@Override
	public boolean move() {
		this.x += vx;
		this.y += vy;

		vx*=1.0001;
		vy*=1.0001;
		absVx*=1.0001;
		absVy*=1.0001;
		this.size *=.999 ;
		this.width = this.size;
		this.height = this.size;
		
		if (this.size <5) return false;
		
		if (x< 0 ){vx = absVx;}
		if (x > gameBoard.getWidth()-size ){vx = -absVx;}
		if (y< 0 ){vy = absVy;}
		if (y > gameBoard.getHeight()-size ){vy = -absVy;}
		return true;

	}

	@Override
	public void draw(Graphics2D g) {
		g.setColor(this.color);
		g.fill (this);

	}

	@Override
	public void move(Set<Actor> allActors) {
				
	}
	
}

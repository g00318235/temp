import java.awt.Color;
import java.awt.Graphics2D;

public class Player implements Actor{
	int x=300;
	int y=300;
	int vel = 2;
	int Width=30;
	int Height=20;  

	boolean up = false;
	boolean down = false;
	boolean left = false;
	boolean right = false;


	@Override
	public void paint(Graphics2D g) {
		g.setColor(Color.WHITE);
		g.fillRect(x, y, Width, Height);

	}

	@Override
	public void move(GameBoard gameboard) {
		if (up){
			y -= vel;
		
		}
		if (down){
			y += vel;
		
		}
		if (left){
			x -= vel;
		
		}
		if (right){
			x += vel;
		
		}
	}
	public void moveUp(boolean yes){
		up=yes;
	}
	public void moveDown(boolean yes){
		down=yes;
	}
	public void moveLeft(boolean yes){
		left=yes;
	}
	public void moveRight(boolean yes){
		right=yes;
	}
}

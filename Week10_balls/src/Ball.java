import java.awt.Color;
import java.awt.Graphics2D;
import java.util.Random;

public class Ball implements Actor{

	private static final Color[] colors = {Color.RED,Color.gray,Color.BLUE,Color.GREEN,Color.YELLOW,Color.ORANGE,Color.MAGENTA};

	int x;
	int y;
	int vx;
	int vy;
	int width;
	int height;
	Color color;


	public Ball(GameBoard gameBoard){
		Random randomGenerator = new Random();
		int var = randomGenerator.nextInt(5);
		int size = (50 + var*10);

		width = (50 + var*10);
		height = width;

		vx = randomGenerator.nextInt(7)-3;
		vy = randomGenerator.nextInt(7)-3;

		int boundX = 400-size;
		int boundY = 400-size;

		x = randomGenerator.nextInt(boundX);
		y = randomGenerator.nextInt(boundY);

		color = colors[randomGenerator.nextInt(colors.length)]; 
	}
	@Override
	public void paint(Graphics2D g) {
		g.setColor(color);
		g.fillOval( x, y, width, height);

	}

	@Override
	public void move(GameBoard gameBoard) {
		x += vx;
		y += vy;

		int boardWidth = gameBoard.getWidth();
		int boardHeight = gameBoard.getHeight();

		if (x + width >= boardWidth){
			vx = -vx;
		}
		if (x < 0 ){
			vx = -vx;
		}
		if (y + height >= boardWidth){
			vy = -vy;
		}
		if (y < 0 ){
			vy = -vy;
		}

	}
}

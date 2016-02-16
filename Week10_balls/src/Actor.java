import java.awt.Graphics2D;

public interface Actor {

	public void paint(Graphics2D g);
	public void move (GameBoard gameboard);

}

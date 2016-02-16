import java.awt.Graphics2D;
import java.awt.Shape;
import java.util.Set;

public interface Actor extends Shape {
	public void move(Set<Actor> allActors);
	public void draw(Graphics2D g);
	public boolean move();
}


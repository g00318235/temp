import javax.swing.JFrame;

@SuppressWarnings("serial")
public class MyJFrame extends JFrame {
	GameBoard gameBoard = new GameBoard();


	public MyJFrame(){
		super();
		initUI();
		placeComponents();
		bindListeners();
	}


	private void initUI() {
		this.setTitle("Balls");
		this.setSize(400, 400);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
	}

	private void placeComponents() {
		this.getContentPane().add(gameBoard);
	}
	private void bindListeners() {
		this .addKeyListener(new KeyListener(){
			public void
		});
	}
}

import java.awt.Container;
import java.awt.Font;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class MyJFrame extends JFrame {


	public MyJFrame(){
		super();
		initUI();
		placeComponents();
		bindListeners();
	}

	private void initUI() {
		this.setTitle("ATM");
		this.setSize(800, 800);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new BorderLayout());
	}

	private void placeComponents() {
		
		JPanel LogoPanel = new JPanel(new BorderLayout());

		ImageIcon image = new ImageIcon("AIB-Logo.jpg");
		JLabel label = new JLabel();
		label.setIcon(image);
		label.setHorizontalAlignment(JLabel.CENTER);
		label.setVerticalAlignment(JLabel.CENTER);
		LogoPanel.add( label, BorderLayout.NORTH );

		Container mainPane = this.getContentPane();
		mainPane.setLayout(new BorderLayout());

		mainPane.add(LogoPanel,BorderLayout.NORTH);
		
		JButton LButton1, LButton2, LButton3,LButton4;
		JButton RButton1, RButton2, RButton3,RButton4;
		JButton Button7, Button8, Button9, ButtonEnter; 
		JButton Button4, Button5, Button6, ButtonCancel; 
		JButton Button1, Button2, Button3, ButtonReturn; 
		JButton ButtonAstrix, Button0, ButtonHash, ButtonBlank;

		LButton1 = new JButton("l1");
		LButton2 = new JButton("l2");
		LButton3 = new JButton("l3");
		LButton4 = new JButton("l4");


		JPanel LPanel = new JPanel();
		LPanel.setLayout(new GridLayout(4,1,4,4));
		LPanel.add(LButton1);
		LPanel.add(LButton2);
		LPanel.add(LButton3);
		LPanel.add(LButton4);

		add(LPanel, BorderLayout.WEST);

		RButton1 = new JButton("r1");
		RButton2 = new JButton("r2");
		RButton3 = new JButton("r3");
		RButton4 = new JButton("r4");

		JPanel RPanel = new JPanel();
		RPanel.setLayout(new GridLayout(4,1,4,4));
		RPanel.add(RButton1);
		RPanel.add(RButton2);
		RPanel.add(RButton3);
		RPanel.add(RButton4);

		add(RPanel, BorderLayout.EAST);

		Button7 = new JButton("7");
		Button8 = new JButton("8");
		Button9 = new JButton("9");
		ButtonEnter = new JButton("Enter");
		Button4 = new JButton("4");
		Button5 = new JButton("5");
		Button6 = new JButton("6");
		ButtonCancel = new JButton("Cancel");
		Button1 = new JButton("1");
		Button2 = new JButton("2");
		Button3 = new JButton("3");
		ButtonReturn = new JButton("Return");
		ButtonAstrix = new JButton("*");
		Button0 = new JButton("0");
		ButtonHash = new JButton("#");
		ButtonBlank = new JButton("");


		JPanel numPanel = new JPanel();
		numPanel.setLayout(new GridLayout (4,4,4,4));
		numPanel.add(Button7);
		numPanel.add(Button8);
		numPanel.add(Button9);
		numPanel.add(ButtonEnter);
		numPanel.add(Button4);
		numPanel.add(Button5);
		numPanel.add(Button6);
		numPanel.add(ButtonCancel);
		numPanel.add(Button1);
		numPanel.add(Button2);
		numPanel.add(Button3);
		numPanel.add(ButtonReturn);
		numPanel.add(ButtonAstrix);
		numPanel.add(Button0);
		numPanel.add(ButtonHash);
		numPanel.add(ButtonBlank);

		add(numPanel, BorderLayout.SOUTH);


		JPanel introPanel = new JPanel();

		introPanel.setLayout(new GridLayout (2,1));
		JLabel jLabel1 = new JLabel("Welcome", JLabel.CENTER);
		jLabel1.setFont(new Font("Verdana",1,30));
		introPanel.add(jLabel1);
		introPanel.add(jLabel1);
		JLabel jLabel2 = new JLabel("Please Insert Your Pin", JLabel.CENTER);
		jLabel2.setFont(new Font("Verdana",1,20));
		introPanel.add(jLabel2);
		introPanel.add(jLabel2);
		this.setBackground(Color.PINK);

		add(introPanel, BorderLayout.CENTER);
	}



	private void bindListeners() {
		// TODO Auto-generated method stub

	}

}

import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;


public class MyDrawing extends JPanel {
	private Cat cat;
	public MyDrawing() 
	{
		// Add critters to the drawing
		cat = new Cat();
	}
	// paintComponent is called automatically when the frame needs
	// to display (e.g., when the program starts)
	public void paintComponent(Graphics g) {
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 5; j++) {
				cat.draw(g, 150*i, 125*j);
			}
		}
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		// Create a JPanel (MyDrawing), we'll draw on this
		frame.setContentPane(new MyDrawing());
		// Program will end when the window is closed
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// Set the size (otherwise only title bar displays)
		frame.setSize(1250, 800);
		
		// Frame will not display until you set visible true
		frame.setVisible(true);
	}

}

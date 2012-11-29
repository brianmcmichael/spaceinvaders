import javax.swing.JFrame;
import javax.swing.JPanel;


public class Game {

	//Create a frame to contain the game
	JFrame container = new JFrame("Space Invaders 101");
	
	//Get hold of the content of the frame and set up the resolution of the game
	JPanel panel = (JPanel) container.getContentPane();
	panel.setPreferredSize(new Dimension(800, 600));
	panel.setLayout(null);
	
	//Set up our canvas size and put it to the context of the frame
	setBounds(0,0,800,600);
	panel.add(this);
	
	
	
	
	
	
	
	
	
	public static void main(String argv[])
	{
		Game g = new Game();
		g.gameLoop();
	}
	
}

package Game;

import javax.swing.JFrame;

public class GameFrame extends JFrame{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private GamePanel game;
    
    public GameFrame()
    {
        
        super("Space Invaders"); // Title bar
        
        
        this.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE); // Allows program to exit when the close button is clicked
        
        // Create an instance of the Game class and turn on double buffering
        //  to ensure smooth animation
        game = new GamePanel();
        game.setDoubleBuffered(true);
        
        this.getContentPane().add(game); 
        this.pack();
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        
        // Starts the game
        game.start();  
    }
    
    public static void main(String[] args) 
    {
         java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new GameFrame().setVisible(true);
            }
        });
        
    }
}
package Game;

import Controller.KeyBoardController;
import java.awt.Color;


public abstract class ControlledGameObject extends GameObject implements Moveable {
    
	KeyBoardController control;
    
    // Constructor for any controllable object
    public ControlledGameObject(int xPosition, int yPosition, Color color, KeyBoardController control)
    {
        super(xPosition, yPosition, color);
        this.control = control;
    }
}

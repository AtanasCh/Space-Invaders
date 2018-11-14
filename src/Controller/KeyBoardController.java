package Controller;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyBoardController implements KeyListener
{
    private boolean[] keyStatus; 
    
    public KeyBoardController()
    {
        keyStatus = new boolean[256]; 
    }
    
    public boolean getKeyStatus(int keyCode)
    {
        if(keyCode < 0 || keyCode > 255){
            return false; 
        }else{
            return keyStatus[keyCode]; 
        }
    }
    
    public void resetController(){
        keyStatus = new boolean[256]; 
    }
    
    @Override
    public void keyTyped(KeyEvent ke) {
        
    }

    @Override
    public void keyPressed(KeyEvent ke) {
        keyStatus[ke.getKeyCode()] = true; 
    }

    @Override
    public void keyReleased(KeyEvent ke) {
        keyStatus[ke.getKeyCode()] = false; 
    }
    
}


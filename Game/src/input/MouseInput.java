package input;

import com.jogamp.newt.event.MouseEvent;
import com.jogamp.newt.event.MouseListener;
import game.Constants;
import game.Gra;

public class MouseInput implements MouseListener {

    @Override
    public void mouseClicked(MouseEvent e) {
            System.out.println(e.getX() + " / " + e.getY());
            
            if (e.getX() < (Constants.border + (Constants.window_width - 2*Constants.border)/3)){
                if (e.getY() < (Constants.border + (Constants.window_width - 2*Constants.border)/3)){
                    Gra.pole1 = Gra.wartoscZnaku();
                } else if (e.getY() < (Constants.border + 2*((Constants.window_width - 2*Constants.border)/3))) {
                    Gra.pole4 = Gra.wartoscZnaku();
                }  else {
                    Gra.pole7 = Gra.wartoscZnaku();
                }
            } else if (e.getX() < (Constants.border + 2*((Constants.window_width - 2*Constants.border)/3))) {
                if (e.getY() < (Constants.border + (Constants.window_width - 2*Constants.border)/3)){
                    Gra.pole2 = Gra.wartoscZnaku();
                } else if (e.getY() < (Constants.border + 2*((Constants.window_width - 2*Constants.border)/3))) {
                    Gra.pole5 = Gra.wartoscZnaku();
                }  else {
                    Gra.pole8 = Gra.wartoscZnaku();
                }
            }  else {
                if (e.getY() < (Constants.border + (Constants.window_width - 2*Constants.border)/3)){
                    Gra.pole3 = Gra.wartoscZnaku();
                } else if (e.getY() < (Constants.border + 2*((Constants.window_width - 2*Constants.border)/3))) {
                    Gra.pole6 = Gra.wartoscZnaku();
                }  else {
                    Gra.pole9 = Gra.wartoscZnaku();
                }
            }
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseMoved(MouseEvent e) {
    }

    @Override
    public void mouseDragged(MouseEvent e) {
    }

    @Override
    public void mouseWheelMoved(MouseEvent e){
    }
    
}

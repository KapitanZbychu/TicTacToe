package game;

import com.jogamp.opengl.GL2;
import com.jogamp.opengl.GLAutoDrawable;
import com.jogamp.opengl.GLEventListener;
import static com.jogamp.opengl.GLProfile.GL2;

public class EventListener implements GLEventListener {
        public static int test=1;
        public static GL2 gl = null;
        
	@Override
	public void init(GLAutoDrawable drawable) {
 
	}

	@Override
	public void dispose(GLAutoDrawable drawable) {
	}

	@Override
	public void display(GLAutoDrawable drawable) {
    	gl = drawable.getGL().getGL2();
    	gl.glClearColor(0,0,0,1);
    	gl.glClear(gl.GL_COLOR_BUFFER_BIT);
        
        
        if (test == 1){
            Graphics.drawSquare(20, -40, 30);
            Graphics.drawX(20, -190, 190);
            Graphics.drawO(20, -40, 30);
        }
        Graphics.drawX((Constants.window_width - 2*Constants.border)/3, -Constants.window_width/2 + Constants.border, Constants.window_height/2 - Constants.border);
        Graphics.drawNet(Constants.window_width - 2*Constants.border, -Constants.window_width/2 + Constants.border, Constants.window_height/2 - Constants.border);
        }

	@Override
	public void reshape(GLAutoDrawable drawable, int x, int y, int width, int hight) {
    	GL2 gl = drawable.getGL().getGL2();
    	gl.glMatrixMode(gl.GL_PROJECTION);
    	gl.glLoadIdentity();
    	gl.glOrtho(-(Constants.window_width/2), Constants.window_width/2, -(Constants.window_height/2), Constants.window_height/2, -1, 1);
    	gl.glMatrixMode(gl.GL_MODELVIEW);
	}
    
}
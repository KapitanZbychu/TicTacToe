package game;

import com.jogamp.opengl.GL2;
import com.jogamp.opengl.GLAutoDrawable;
import com.jogamp.opengl.GLEventListener;
import static com.jogamp.opengl.GLProfile.GL2;

public class EventListener implements GLEventListener {
    
        public static GL2 gl = null;
        
	@Override
	public void init(GLAutoDrawable drawable) {
  	System.out.println("Hello");
	}

	@Override
	public void dispose(GLAutoDrawable drawable) {
	}

	@Override
	public void display(GLAutoDrawable drawable) {
    	gl = drawable.getGL().getGL2();
    	gl.glClearColor(0,0,0,1);
    	gl.glClear(gl.GL_COLOR_BUFFER_BIT);
        
        Graphics.drawSquare(100, 150, 10);
	}

	@Override
	public void reshape(GLAutoDrawable drawable, int x, int y, int width, int hight) {
    	GL2 gl = drawable.getGL().getGL2();
    	gl.glMatrixMode(gl.GL_PROJECTION);
    	gl.glLoadIdentity();
    	gl.glOrtho(-320, 320, -180, 180, -1, 1);
    	gl.glMatrixMode(gl.GL_MODELVIEW);
   	 
   	 
	}
    
}
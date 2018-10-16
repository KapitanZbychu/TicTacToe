package game;

import com.jogamp.opengl.GL2;
import com.jogamp.opengl.GLAutoDrawable;
import com.jogamp.opengl.GLEventListener;
import static com.jogamp.opengl.GLProfile.GL2;

public class EventListener implements GLEventListener {
//test
	@Override
	public void init(GLAutoDrawable drawable) {
  	System.out.println("Hello");
	}

	@Override
	public void dispose(GLAutoDrawable drawable) {
	}

	@Override
	public void display(GLAutoDrawable drawable) {
    	GL2 gl = drawable.getGL().getGL2();
    	gl.glClearColor(0,0,0,1);
    	gl.glClear(gl.GL_COLOR_BUFFER_BIT);
    	gl.glColor3f(0,0,1);
    	gl.glBegin(gl.GL_QUADS);
        	gl.glVertex2f(-50,-50);
        	gl.glVertex2f(50,-50);
        	gl.glVertex2f(50,50);
        	gl.glVertex2f(-50,50);
    	//
    	gl.glEnd();
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
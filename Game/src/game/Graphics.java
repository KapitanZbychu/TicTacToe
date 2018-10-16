package game;

import com.jogamp.opengl.GL2;
import com.jogamp.opengl.GLAutoDrawable;

public class Graphics {
    
    public static void drawTriangle(GLAutoDrawable drawable) {
      GL2 gl = drawable.getGL().getGL2();
      gl.glBegin (gl.GL_LINES);
   
      //drawing the base
      gl.glBegin (gl.GL_LINES);
      gl.glVertex3f(50, -50, 0);
      gl.glEnd();
   
      //drawing the right edge
      gl.glBegin (gl.GL_LINES);
      gl.glVertex3f(0, 50, 0);
      gl.glVertex3f(50, 50, 0);
      gl.glEnd();
   
      //drawing the lft edge
      gl.glBegin (gl.GL_LINES);
      gl.glVertex3f(0, 50, 0);
      gl.glVertex3f(50, -50, 0);
      gl.glEnd();
      gl.glFlush();
    }
}

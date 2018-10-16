package game;

import com.jogamp.opengl.GL2;
import com.jogamp.opengl.GLAutoDrawable;

public class Graphics {
    
    public static void drawSquare(GLAutoDrawable drawable) {
      GL2 gl = drawable.getGL().getGL2();
      
      //Top
      gl.glBegin( GL2.GL_LINES );
      gl.glVertex2f( -10,10 );
      gl.glVertex2f( 10,10 );
      gl.glEnd();
      
      gl.glFlush();
    }
}

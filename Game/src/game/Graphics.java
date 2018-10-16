package game;

import com.jogamp.opengl.GL2;

public class Graphics {
    
    public static void drawSquare(int d, int x, int y) {
      GL2 gl = EventListener.gl;
      
      
      //Top
      gl.glBegin( GL2.GL_LINES );
      gl.glVertex2f( x,y );
      gl.glVertex2f( x+d,y );
      gl.glEnd();
      
      //Bottom
      gl.glBegin( GL2.GL_LINES );
      gl.glVertex2f( x,y-d );
      gl.glVertex2f( x+d, y-d );
      gl.glEnd();
      
         //Left
      gl.glBegin( GL2.GL_LINES );
      gl.glVertex2f( x,y );
      gl.glVertex2f( x, y-d );
      gl.glEnd();
      
      //Right
      gl.glBegin( GL2.GL_LINES );
      gl.glVertex2f(x + d, y );
      gl.glVertex2f(x+ d, y- d );
      gl.glEnd();
      
      gl.glFlush();
      
      
    }
    
    public static void drawExample() {
        /*
    	gl.glColor3f(0,0,1);
    	gl.glBegin(gl.GL_QUADS);
        	gl.glVertex2f(-50,-50);
        	gl.glVertex2f(50,-50);
        	gl.glVertex2f(50,50);
        	gl.glVertex2f(-50,50);
    	//
    	gl.glEnd();
        
        gl.glColor4f(1,1,255,1);
        gl.glBegin( GL2.GL_QUADS );
        gl.glVertex2f(20,20);
        gl.glVertex2f(40,20);
        gl.glVertex2f(40,80);
        gl.glVertex2f(20,80);
        gl.glEnd();*/
    }
    
    public static void drawX(int d, int x, int y) {
      GL2 gl = EventListener.gl;
      
      //
      gl.glBegin( GL2.GL_LINES );
      gl.glVertex2f( x,y );
      gl.glVertex2f( x+d,y-d);
      gl.glEnd();
      
      //Bottom
      gl.glBegin( GL2.GL_LINES );
      gl.glVertex2f( x+d,y );
      gl.glVertex2f( x, y-d );
      gl.glEnd();
      
    
      gl.glFlush();
      
      
    }

}


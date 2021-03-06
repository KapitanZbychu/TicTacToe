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
    
    public static void drawNet(int d, int x, int y) {
        GL2 gl = EventListener.gl;
        //
        gl.glBegin( GL2.GL_LINES );
        gl.glVertex2f( x+d/3,y );
        gl.glVertex2f( x+d/3,y-d);
        gl.glEnd();
        
        //
        gl.glBegin( GL2.GL_LINES );
        gl.glVertex2f( x+2*d/3,y );
        gl.glVertex2f( x+2*d/3,y-d );
        gl.glEnd();


        gl.glBegin( GL2.GL_LINES );
        gl.glVertex2f( x,y-d/3);
        gl.glVertex2f( x+d,y-d/3 );
        gl.glEnd();

        gl.glBegin( GL2.GL_LINES );
        gl.glVertex2f( x,y-2*d/3 );
        gl.glVertex2f( x+d,y-2*d/3);
        gl.glEnd();
        
        gl.glFlush();
         
        /*
        gl.glBegin( GL2.GL_LINES );
        gl.glVertex2f( x+d,y );
        gl.glVertex2f( x+d,y-3*d);
        gl.glEnd();
        
        //
        gl.glBegin( GL2.GL_LINES );
        gl.glVertex2f( x+2*d,y );
        gl.glVertex2f( x+2*d,y-3*d );
        gl.glEnd();


        gl.glBegin( GL2.GL_LINES );
        gl.glVertex2f( x,y-d);
        gl.glVertex2f( x+3*d,y-d );
        gl.glEnd();

        gl.glBegin( GL2.GL_LINES );
        gl.glVertex2f( x,y-2*d );
        gl.glVertex2f( x+3*d,y-2*d);
        gl.glEnd();
        */
      
    }

    public static void drawO(int radius, int x, int y) {
        GL2 gl = EventListener.gl;
        radius=radius/2;
        
        gl.glBegin( GL2.GL_LINE_LOOP );
 
        for (int i=0; i<360; i++)
        {
            double degInRad = Math.toRadians(i);
            gl.glVertex2f((float)Math.cos(degInRad)*radius+x+radius, (float)Math.sin(degInRad)*radius-(radius-y));
        }

        gl.glEnd();
    }
}


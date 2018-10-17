package game;

import com.jogamp.newt.opengl.GLWindow;
import com.jogamp.opengl.GLCapabilities;
import com.jogamp.opengl.GLProfile;
import com.jogamp.opengl.util.FPSAnimator;
import input.MouseInput;

public class Game {
        private static GLWindow window = null;
    
	public static void init (){
    	GLProfile.initSingleton();
    	GLProfile profile = GLProfile.get(GLProfile.GL2);
    	GLCapabilities caps = new GLCapabilities(profile);
   	 
    	window = GLWindow.create(caps);
    	window. setSize(Constants.window_width, Constants.window_height);
    	window. setResizable(false);
    	window.addGLEventListener(new EventListener());
        window.addMouseListener(new MouseInput());
   	 
    	FPSAnimator animator = new FPSAnimator(window, 60);
    	animator.start();
   	 
    	window.setVisible(true);
     	 
	}
    
 	public static void main (String[] args) {
     	init();
    	 
 	}
}


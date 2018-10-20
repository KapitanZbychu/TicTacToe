package game;

public class Gra {
    public static int pole1=0;
    public static int pole2=0;
    public static int pole3=0;
    public static int pole4=0;
    public static int pole5=0;
    public static int pole6=0;
    public static int pole7=0;
    public static int pole8=0;
    public static int pole9=0;
    
    public static void Rysuj() {
        if (pole1 == 1){
            Graphics.drawX((Constants.window_width - 2*Constants.border)/3, -Constants.window_width/2 + Constants.border, Constants.window_height/2 - Constants.border);
        } else if (pole1 == 2) {
            Graphics.drawO((Constants.window_width - 2*Constants.border)/3, -Constants.window_width/2 + Constants.border, Constants.window_height/2 - Constants.border);
        }
        if (pole2 == 1){
            Graphics.drawX((Constants.window_width - 2*Constants.border)/3, -Constants.window_width/2 + Constants.border, Constants.window_height/2 - Constants.border);
        } else if (pole2 == 2) {
            Graphics.drawO((Constants.window_width - 2*Constants.border)/3, -Constants.window_width/2 + Constants.border, Constants.window_height/2 - Constants.border);
        }
           if (pole3 == 1){
            Graphics.drawX((Constants.window_width - 2*Constants.border)/3, -Constants.window_width/2 + Constants.border, Constants.window_height/2 - Constants.border);
        } else if (pole3 == 2) {
            Graphics.drawO((Constants.window_width - 2*Constants.border)/3, -Constants.window_width/2 + Constants.border, Constants.window_height/2 - Constants.border);
        }
           if (pole4 == 1){
            Graphics.drawX((Constants.window_width - 2*Constants.border)/3, -Constants.window_width/2 + Constants.border, Constants.window_height/2 - Constants.border);
        } else if (pole4 == 2) {
            Graphics.drawO((Constants.window_width - 2*Constants.border)/3, -Constants.window_width/2 + Constants.border, Constants.window_height/2 - Constants.border);
        }
           if (pole5 == 1){
            Graphics.drawX((Constants.window_width - 2*Constants.border)/3, -Constants.window_width/2 + Constants.border, Constants.window_height/2 - Constants.border);
        } else if (pole5 == 2) {
            Graphics.drawO((Constants.window_width - 2*Constants.border)/3, -Constants.window_width/2 + Constants.border, Constants.window_height/2 - Constants.border);
        }
           if (pole6 == 1){
            Graphics.drawX((Constants.window_width - 2*Constants.border)/3, -Constants.window_width/2 + Constants.border, Constants.window_height/2 - Constants.border);
        } else if (pole6 == 2) {
            Graphics.drawO((Constants.window_width - 2*Constants.border)/3, -Constants.window_width/2 + Constants.border, Constants.window_height/2 - Constants.border);
        }
          if (pole7 == 1){
            Graphics.drawX((Constants.window_width - 2*Constants.border)/3, -Constants.window_width/2 + Constants.border, Constants.window_height/2 - Constants.border);
        } else if (pole7 == 2) {
            Graphics.drawO((Constants.window_width - 2*Constants.border)/3, -Constants.window_width/2 + Constants.border, Constants.window_height/2 - Constants.border);
        }
          if (pole8 == 1){
            Graphics.drawX((Constants.window_width - 2*Constants.border)/3, -Constants.window_width/2 + Constants.border, Constants.window_height/2 - Constants.border);
        } else if (pole8 == 2) {
            Graphics.drawO((Constants.window_width - 2*Constants.border)/3, -Constants.window_width/2 + Constants.border, Constants.window_height/2 - Constants.border);
        }
          if (pole9 == 1){
            Graphics.drawX((Constants.window_width - 2*Constants.border)/3, -Constants.window_width/2 + Constants.border, Constants.window_height/2 - Constants.border);
        } else if (pole9 == 2) {
            Graphics.drawO((Constants.window_width - 2*Constants.border)/3, -Constants.window_width/2 + Constants.border, Constants.window_height/2 - Constants.border);
        }    
              
    }
}
